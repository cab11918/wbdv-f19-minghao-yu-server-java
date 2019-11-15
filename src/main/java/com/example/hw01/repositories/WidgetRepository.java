package com.example.hw01.repositories;

import com.example.hw01.models.Hello;
import com.example.hw01.models.Widget;
import org.springframework.data.repository.CrudRepository;
import com.example.hw01.repositories.HelloRepository;

public interface WidgetRepository
    extends CrudRepository<Widget, Integer> {}
