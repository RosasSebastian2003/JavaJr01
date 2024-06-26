package com.srm.store_demo.user;

import org.springframework.stereotype.Service;

import com.srm.store_demo.exceptions.ApiRequestException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository; 
    }

    // GET all
    public List<UserEntity> getUsers() {
        if (userRepository.findAll().isEmpty()) {
            throw new ApiRequestException("No users found");
        }
        return userRepository.findAll();
    }

    // POST
    public void addUser(UserEntity user) {
        Optional<UserEntity> userIsPresent = userRepository.findByEmail(user.getEmail());

        if (userIsPresent.isPresent()) {
            throw new ApiRequestException("User with email " + user.getEmail() + " already exists");
        }
        userRepository.save(user);
    }

    // DELETE
    public void deleteUser(Long id) {
        boolean userExists = userRepository.existsById(id);

        if (!userExists) {
            throw new IllegalStateException("User with id " + id + " does not exist");
        }

        userRepository.deleteById(id);
    }
}
