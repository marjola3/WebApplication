package com.mp.webapp.service;

import com.mp.webapp.entity.UserEntity;
import com.mp.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author: Mariola
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public Iterable<UserEntity> save(Iterable<UserEntity> users) {
        return userRepository.save(users);
    }

    @Override
    @Transactional
    public void delete(UserEntity user) {
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public void delete(Iterable<UserEntity> users) {
        userRepository.delete(users);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
