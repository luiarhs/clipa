package mx.clip.api.services;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.clip.api.models.User;
import mx.clip.api.repositories.IUserRepository;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    IUserRepository userRepository;

    public ArrayList<User> getUsers() {
        return (ArrayList<User>) userRepository.findAll();
    }
    
}
