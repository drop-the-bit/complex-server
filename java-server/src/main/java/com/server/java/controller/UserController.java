package com.server.java.controller;

import com.server.java.entity.User;
import com.server.java.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserRepo userRepo;
    private final EntityManager em;

    @GetMapping("/{value}")
    public Page<User> search(@PathVariable String value) {
        PageRequest page = PageRequest.of(0, 20);
        return userRepo.findByNameContains(value, page);
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userRepo.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        userRepo.findById(id).ifPresent(userRepo::delete);
    }
}