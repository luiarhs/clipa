package mx.clip.api.daos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.clip.api.entities.Transaction;

public interface ITransactionDAO extends PagingAndSortingRepository<Transaction, Long>{
	
	@Query("select u from Transaction u where userId=?1")
	public List<Transaction> findAllTransactionsByUser(Long userId);
}
