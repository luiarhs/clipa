package mx.clip.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.clip.api.entities.Transaction;

@Repository
public interface ITransactionRepository extends CrudRepository<Transaction, Long>{}
