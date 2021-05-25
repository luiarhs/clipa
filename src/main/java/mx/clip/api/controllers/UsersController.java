package mx.clip.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.clip.api.models.User;
import mx.clip.api.services.UserService;



@Async
@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    
    @Autowired
    UserService userService;

    @GetMapping("/{id}/transactions")
    public ArrayList<User> GetTrasactionsAsync(@PathVariable String id)
    {
        return userService.getUsers();
    }
}
