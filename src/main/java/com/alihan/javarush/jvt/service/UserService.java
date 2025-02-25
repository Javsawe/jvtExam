package com.alihan.javarush.jvt.service;

import com.alihan.javarush.jvt.entity.User;
import com.alihan.javarush.jvt.entity.Role;
import com.alihan.javarush.jvt.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

    User blockUser(User user);

    void deleteUser(String username,String roleName, Long id);
}
