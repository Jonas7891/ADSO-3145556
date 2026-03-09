package com.sena.apiejemplo.Controller;

import java.util.List;
import java.util.Optional;

import com.sena.apiejemplo.Entity.User;
import com.sena.apiejemplo.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiejemplo/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/searchId")
    public Optional<User> getUserIds(
        @RequestParam(required = false) Long id) {

        if (id != null) {
            return userService.getUserId(id);
        }

        return userService.getUserId(id);
    }

    @GetMapping("/search")
    public List<User> searchUsers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {

        if (name != null) {
            return userService.getUserByName(name);
        }

        if (email != null) {
            return List.of(userService.getUserByEmail(email).orElse(null));
        }

        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return "Usuario eliminado correctamente";
    }
}