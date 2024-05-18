package com.srm.store_demo.user;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    
}
