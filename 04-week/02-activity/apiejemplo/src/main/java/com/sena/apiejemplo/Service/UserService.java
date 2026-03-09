package com.sena.apiejemplo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.apiejemplo.Entity.User;
import com.sena.apiejemplo.IRepository.IUserRepository;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserId(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> getUserByPassword(String password) {
        return userRepository.findByPassword(password);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User user) {

        Optional<User> userData = userRepository.findById(id);

        if (userData.isPresent()) {

            User existingUser = userData.get();

            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            existingUser.setUpdatedAt(user.getUpdatedAt());
            existingUser.setUpdatedBy(user.getUpdatedBy());

            return userRepository.save(existingUser);
        }

        return null;
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}