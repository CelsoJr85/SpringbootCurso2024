package com.magnasoftwares.Curso2024.resource;

import com.magnasoftwares.Curso2024.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Celso", "celso@gmail.com", "11 999999999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
