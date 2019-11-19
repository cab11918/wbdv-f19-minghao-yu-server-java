package com.example.hw01.repositories;

import com.example.hw01.models.Topic;
import com.example.hw01.models.Widget;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository
    extends CrudRepository<Topic, Integer> {}
