package com.mp.webapp.repository;

import com.mp.webapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Author: Mariola
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
