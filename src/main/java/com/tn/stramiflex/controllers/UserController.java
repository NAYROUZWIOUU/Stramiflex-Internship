package com.tn.stramiflex.controllers;

import com.tn.stramiflex.entities.User;
import com.tn.stramiflex.services.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
public class UserController {



    @Autowired
    UserServiceI us;


    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
        return us.addUser(user);
    }

    @GetMapping("get-all-users")
    @ResponseBody
    @Transactional
    public List<User> getAllUsers(){
        return  us.getAllUsers();
    }



    @PostMapping("updateUser/{idUser}")
    @ResponseBody
    User update(@RequestBody User user, @PathVariable Long idUser){
        return us.update(user, idUser);
    }


    @DeleteMapping("delete-user/{id}")
    @ResponseBody
    public boolean DeleteUser(@PathVariable("id") Long id){
        us.delete(id);
        return true;
    }



}
