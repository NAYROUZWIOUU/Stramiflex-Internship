package com.tn.stramiflex.services;

import com.tn.stramiflex.entities.User;
import com.tn.stramiflex.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserServiceI{

    @Autowired
    UserRepository ur;

    @Override
    public User addUser(User user){
        return ur.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return ur.findAll();
    }

    @Override
    public User update(User user, Long idUser) {
        user.setIdUser(idUser);
        return ur.save(user);
    }

    @Override
    public void delete(Long id) {
        ur.deleteById(id);
    }

}
