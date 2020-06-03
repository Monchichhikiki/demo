package com.mx.cassandra.demo.serviceimpl;

import com.mx.cassandra.demo.repository.UserRepository;
import com.mx.cassandra.demo.service.UserService;
import com.mx.cassandra.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author qiqi
 * @date 2020-06-01 14:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(String id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return userOptional.get();
        }
        return null;
    }
}
