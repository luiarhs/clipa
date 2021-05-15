package mx.clip.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.clip.api.services.AmazonDynamoDbClient;


@Async
@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    
    @Autowired
    private AmazonDynamoDbClient dynamoClient;

    @GetMapping("/{id}/transactions")
    public List<String> GetTrasactionsAsync(@PathVariable String id)
    {
        return dynamoClient.amazonDynamoClient().listTables().tableNames();
    }
}
