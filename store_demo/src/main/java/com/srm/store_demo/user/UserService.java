package com.srm.store_demo.user;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository; 
    }

    // GET all
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // POST
    public void addUser(User user) {
        Optional<User> userIsPresent = userRepository.findByEmail(user.getEmail());

        if (userIsPresent.isPresent()) {
            throw new IllegalStateException("Email is already taken");
        }

        userRepository.save(user);
    }
}
