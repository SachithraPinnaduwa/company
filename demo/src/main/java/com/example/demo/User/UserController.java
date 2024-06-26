package com.example.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }
@PostMapping
    public User getUser(@RequestBody User user){
       return userService.getUser(user);
    }

    @PostMapping("/create")
    public void createUser(@RequestBody User user){
        userService.addNewUser(user);
    }

    @DeleteMapping(path = "{studentname}")
    public  void  deleteStudent(@PathVariable("studentname") String name ){
userService.deleteUser("sachithra");
    }

}
