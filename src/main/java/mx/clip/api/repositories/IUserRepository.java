package mx.clip.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.clip.api.models.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {
    
}
