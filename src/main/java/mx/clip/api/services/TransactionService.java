package mx.clip.api.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.clip.api.daos.ITransactionDAO;
import mx.clip.api.entities.Transaction;
import mx.clip.api.repositories.ITransactionRepository;


@Service
public class TransactionService implements ITransactionService {

    Logger logger = LoggerFactory.getLogger(TransactionService.class);

    @Autowired
    private ITransactionDAO _transactionDao;

    @Autowired
    private ITransactionRepository _transactionRepository;

    public Transaction MakeTransaction(Transaction trasaction) {
        return _transactionRepository.save(trasaction);
    }

    public List<Transaction> GetTransactionsByUser(Long userId) {
        return _transactionDao.findAllTransactionsByUser(userId);
    }
    
}
