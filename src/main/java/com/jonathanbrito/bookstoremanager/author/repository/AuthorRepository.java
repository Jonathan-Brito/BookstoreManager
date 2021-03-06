package com.jonathanbrito.bookstoremanager.author.repository;

import com.jonathanbrito.bookstoremanager.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
