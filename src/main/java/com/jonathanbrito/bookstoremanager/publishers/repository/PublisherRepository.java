package com.jonathanbrito.bookstoremanager.publishers.repository;

import com.jonathanbrito.bookstoremanager.publishers.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
