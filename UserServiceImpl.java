package com.omniacademy.service;

import com.omniacademy.repository.UserRepository;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author Wijdane KHATTAT
 */
public class UserServiceImpl {
    private static Logger logger = Logger.getLogger(UserRepository.class.getName());

    private UserRepository userRepository;

    public UserServiceImpl() {
        this.userRepository= new UserRepository();
    }

    public List<String> getUsers() {
        logger.info("getUser() method - UserServiceImpl");
        return userRepository.getAllUsers().stream().peek(user -> user.toUpperCase()).collect(Collectors.toList());
    }
}
