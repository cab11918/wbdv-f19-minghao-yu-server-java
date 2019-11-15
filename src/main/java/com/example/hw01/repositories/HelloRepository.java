package com.example.hw01.repositories;

import com.example.hw01.models.Hello;
import org.springframework.data.repository.CrudRepository;
import com.example.hw01.repositories.HelloRepository;

public interface HelloRepository
    extends CrudRepository<Hello, Integer> {}
