package mx.clip.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.clip.api.dtos.PayloadDTO;
import mx.clip.api.services.TransactionService;

@RestController
@RequestMapping("/api/v1/trasaction")
public class TransactionController
{
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<String> Payment (@RequestBody PayloadDTO input)
    {

        return null;
    }
    
}
