package br.com.mercadolivre.mongo_demo.controllers;

import br.com.mercadolivre.mongo_demo.dto.UserDTO;
import br.com.mercadolivre.mongo_demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<UserDTO> getAllUsers(){
        return userService.findAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable String id, @RequestBody UserDTO user){
        return userService.updateUser(id, user);
    }
}
