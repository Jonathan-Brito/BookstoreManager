package com.jonathanbrito.bookstoremanager.users.repository;

import com.jonathanbrito.bookstoremanager.users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
