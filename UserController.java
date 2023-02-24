package com.omniacademy.controller;

//import com.omniacademy.repository.UserRepository;

import com.omniacademy.dto.UserDto;
import com.omniacademy.service.AddressService;
import com.omniacademy.service.UserServiceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.ServiceLoader;

/**
 * @author Wijdane KHATTAT
 */
public class UserController {
    private static UserServiceImpl userService = new UserServiceImpl();
    //private UserRepository userRepository;

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("***************** get Users from Repository ******************");
        userService.getUsers().forEach(user -> System.out.println(user));
        System.out.println("\n***********************");
        //UserDto userDto = new UserDto();
        //System.out.println(userDto.id +" " +userDto.name +" " +userDto.age);

        System.out.println("\n***********************");
        //DatabaseConfig databaseConfig= new DatabaseConfig();
        Class c = Class.forName("com.omniacademy.config.DataBaseConfig");
        Field[] fields = c.getDeclaredFields();
        Method[] methods = c.getMethods();
        System.out.println("*** Methods ****");
        Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));
        System.out.println("*** Fields ****");
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));

        System.out.println("\n********** Services *************");
        ServiceLoader<AddressService> sl = ServiceLoader.load(AddressService.class);
        System.out.println(sl.stream().count());
        AddressService addressService = sl.findFirst().get();
        String address = addressService.getMediapostAddress();
        System.out.println(address);



    }
}
