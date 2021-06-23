package br.com.mercadolivre.mongo_demo.service;

import br.com.mercadolivre.mongo_demo.dto.UserDTO;
import br.com.mercadolivre.mongo_demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO user) {
        return userRepository.save(user);
    }

    public List<UserDTO> findAllUsers(){
        return userRepository.findAll();
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public UserDTO updateUser(String id, UserDTO user) {
        user.setId(id);
        return userRepository.save(user);
    }
}
