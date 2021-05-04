package com.jonathanbrito.bookstoremanager.books.repository;

import com.jonathanbrito.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
