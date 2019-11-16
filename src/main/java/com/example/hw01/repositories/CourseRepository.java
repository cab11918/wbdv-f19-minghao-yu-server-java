package com.example.hw01.repositories;

import com.example.hw01.models.Course;
import com.example.hw01.models.Widget;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository
    extends CrudRepository<Course, Integer> {}
