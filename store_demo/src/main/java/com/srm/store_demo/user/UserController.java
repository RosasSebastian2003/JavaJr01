package com.srm.store_demo.user;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/user") // http:localhost:8080/api/user
public class UserController {
    private final UserService userService;

    // Constructor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // https:youtube.com/watch?v=1234
    @GetMapping("getAll")
    public List<User> getMethodName() {
        return userService.getUsers();
    }

    // POST
    @PostMapping("addUser")
    public void addUser(@Valid @RequestBody User user) {
        userService.addUser(user);
    }

    // DELETE
    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUser(userId);
    }
    
}
