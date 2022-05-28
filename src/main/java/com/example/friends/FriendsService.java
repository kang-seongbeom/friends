package com.example.friends;

import com.example.friends.domain.User;
import com.example.friends.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@org.springframework.stereotype.Service
public class FriendsService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
