package ru.mirea.tvksp_3.domain.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mirea.tvksp_3.data.User;
import ru.mirea.tvksp_3.domain.dto.UserDTO;
import ru.mirea.tvksp_3.domain.repos.UserRepo;
import ru.mirea.tvksp_3.domain.service.UserService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> readAll(){
        return new ResponseEntity<>(userService.readAll(), HttpStatus.OK);
    }
    @PostMapping("/api/add_user")
    public ResponseEntity<User> create(@RequestBody UserDTO dto) {
        return new ResponseEntity<User>(userService.create(dto), HttpStatus.OK);
    }
}
