package com.tn.stramiflex.services;


import com.tn.stramiflex.entities.User;

import java.util.List;

public interface UserServiceI {

    User addUser(User user);

    List<User> getAllUsers();

    User update(User user, Long idUser);

    void delete(Long id);
}
