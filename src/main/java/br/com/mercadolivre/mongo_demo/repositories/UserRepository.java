package br.com.mercadolivre.mongo_demo.repositories;

import br.com.mercadolivre.mongo_demo.dto.UserDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDTO, String> {
}
