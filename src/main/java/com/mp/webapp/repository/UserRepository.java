package com.mp.webapp.repository;

import com.mp.webapp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Mariola
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
