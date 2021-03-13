package com.example.lab4.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/{id}")
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/users/{id}", method=RequestMethod.PUT)
    public void updateUser(@RequestBody User user, @PathVariable String id) {
        userService.updateUser(id, user);
    }

    @RequestMapping(value = "/users/{id}", method=RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
