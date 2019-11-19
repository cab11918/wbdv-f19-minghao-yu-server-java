package com.example.hw01.repositories;

import com.example.hw01.models.Lesson;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LessonRepository
    extends CrudRepository<Lesson, Integer> {

  @Query("select lesson from Lesson lesson where lesson.module.id=:moduleId")
  public List<Lesson> findLessonForModule(
      @Param("moduleId") Integer id
  );
}
