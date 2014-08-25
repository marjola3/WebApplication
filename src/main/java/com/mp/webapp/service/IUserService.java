package com.mp.webapp.service;

import com.mp.webapp.entity.UserEntity;

import java.util.List;

/**
 * Author: Mariola
 */
public interface IUserService {

    UserEntity save(UserEntity user);

    Iterable<UserEntity> save(Iterable<UserEntity> users);

    void delete(UserEntity user);

    void delete(Iterable<UserEntity> users);

    void delete(Long id);

    List<UserEntity> findAll();
}
