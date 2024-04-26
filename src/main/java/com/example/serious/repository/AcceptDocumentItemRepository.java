package com.example.serious.repository;

import com.example.serious.entity.AcceptDocumentItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptDocumentItemRepository extends JpaRepository<AcceptDocumentItem,Long> {
}
