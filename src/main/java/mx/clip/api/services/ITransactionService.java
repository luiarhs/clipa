package mx.clip.api.services;

import java.util.List;

import mx.clip.api.entities.Transaction;

public interface ITransactionService {

    public Transaction MakeTransaction(Transaction trasaction);
    public List<Transaction> GetTransactionsByUser(Long userId);
    
}
