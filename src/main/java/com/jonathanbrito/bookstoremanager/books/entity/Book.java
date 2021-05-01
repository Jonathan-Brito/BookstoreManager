package com.jonathanbrito.bookstoremanager.books.entity;

import com.jonathanbrito.bookstoremanager.author.entity.Author;
import com.jonathanbrito.bookstoremanager.entity.Auditable;
import com.jonathanbrito.bookstoremanager.publishers.entity.Publisher;
import com.jonathanbrito.bookstoremanager.users.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Book extends Auditable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private int pages;

    @Column(columnDefinition = "integer default 0")
    private int chapters;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Author author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private User user;
}
