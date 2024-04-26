package com.example.serious.repository;

import com.example.serious.entity.AcceptDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptDocumentRepository extends JpaRepository<AcceptDocument,Long> {
}
