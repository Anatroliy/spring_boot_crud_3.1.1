package com.springboot.crud.spring_boot_crud.service;



import com.springboot.crud.spring_boot_crud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);
//TODO
//    void updateUser(Long id, User updatedUser);
}
