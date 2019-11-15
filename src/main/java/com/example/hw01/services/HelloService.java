package com.example.hw01.services;


import com.example.hw01.models.Hello;
import com.example.hw01.repositories.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

  @Autowired
  HelloRepository repository;

  @GetMapping("/api/hello")
  public Iterable<Hello> findAllHellos() {
    return repository.findAll();
  }
}

