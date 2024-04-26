<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Category Management</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .container {
            margin-top: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Category Management</h1>

    <!-- Create Category -->
    <div class="form-group">
        <label for="createName">Create Category</label>
        <input type="text" class="form-control" id="createName" placeholder="Category Name">
        <button onclick="createCategory()" class="btn btn-primary mt-2">Create</button>
    </div>

    <!-- Edit Category -->
    <div class="form-group">
        <label for="editId">Category ID to Edit</label>
        <input type="text" class="form-control" id="editId" placeholder="Category ID">
        <label for="editName">New Category Name</label>
        <input type="text" class="form-control" id="editName" placeholder="New Category Name">
        <button onclick="editCategory()" class="btn btn-warning mt-2">Edit</button>
    </div>

    <!-- Delete Category -->
    <div class="form-group">
        <label for="deleteId">Delete Category</label>
        <input type="text" class="form-control" id="deleteId" placeholder="Category ID">
        <button onclick="deleteCategory()" class="btn btn-danger mt-2">Delete</button>
    </div>

    <!-- Show All Categories -->
    <button onclick="showAllCategories()" class="btn btn-info">Show All Categories</button>
    <div id="categoriesList" class="mt-3"></div>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<script>
    const apiUrl = "<%=request.getContextPath()%>/api/Category";

    async function createCategory() {
        const name = document.getElementById('createName').value;
        await fetch(apiUrl, {
            method: 'PUT',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({name: name})
        });
        showAllCategories(); // Refresh the list after adding
    }

    async function editCategory() {
        const id = document.getElementById('editId').value;
        const name = document.getElementById('editName').value;
        await fetch(`${apiUrl}/${id}`, { // Adjust the URL to include the ID as a path variable
            method: 'POST', // Your controller uses POST for updates, which is unconventional. Consider using PUT or PATCH.
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({id: id, name: name}) // Ensure your backend correctly parses this structure
        });
        showAllCategories(); // Refresh the list after editing
    }

    async function deleteCategory() {
        const id = document.getElementById('deleteId').value;
        await fetch(`${apiUrl}/${id}`, {
            method: 'DELETE' // Matches the Spring controller
        });
        showAllCategories(); // Refresh the list after deletion
    }

    async function showAllCategories() {
        const response = await fetch(apiUrl);
        if(response.ok) {
            const categories = await response.json();
            const listElement = document.getElementById('categoriesList');
            listElement.innerHTML = categories.map(category => `<p>${category.id} - ${category.name}</p>`).join('');
        } else {
            document.getElementById('categoriesList').innerHTML = 'Failed to load categories.';
        }
    }
</script>


</body>
</html>
