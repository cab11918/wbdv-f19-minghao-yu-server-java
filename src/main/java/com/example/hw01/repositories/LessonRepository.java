package com.example.hw01.repositories;

import com.example.hw01.models.Lesson;
import com.example.hw01.models.Widget;
import org.springframework.data.repository.CrudRepository;

public interface LessonRepository
    extends CrudRepository<Lesson, Integer> {}
