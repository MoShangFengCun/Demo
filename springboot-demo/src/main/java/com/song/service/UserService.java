package com.song.service;

import com.song.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.song.repository.UserRepository;

/**
 * Created by 600601 on 2018/1/29.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserByName(String name){
        User user = null;
        try {
            user = userRepository.findByUserName(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  user;
    }
}
