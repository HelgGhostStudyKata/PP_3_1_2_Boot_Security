package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserServiceDAO {
    List<User> getAll();

    User get(Long id);

    User get(String name);

    void add(User user);

    void update(Long id, User user);

    void delete(Long id);
}
