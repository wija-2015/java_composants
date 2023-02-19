package com.omniacademy.repository;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Wijdane KHATTAT
 */
public class UserRepository {

    private static Logger logger = Logger.getLogger(UserRepository.class.getName());

    public List<String> getAllUsers(){
        logger.info("getAllUser() method - UserRepository");
        return Arrays.asList("adam", "ghali", "sami", "nour", "amine");
    }
    public  String getUser(){
        return "adam";
        //UserEntityMapper userEntityMapper = new UserEntityMapper();
        //UserDtoMapper userDtoMapper = new UserDtoMapper();
    }
}
