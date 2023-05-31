package net.javatatiana.springbootdto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javatatiana.springbootdto.dto.UserLocationDTO;
import net.javatatiana.springbootdto.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();  //llamado al metodo de UserSerrvice
    }
}