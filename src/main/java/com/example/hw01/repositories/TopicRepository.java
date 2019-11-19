package com.example.hw01.repositories;

import com.example.hw01.models.Lesson;

import com.example.hw01.models.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicRepository
    extends CrudRepository<Topic, Integer> {
  @Query("select topic from Topic topic where topic.lesson.id=:lessonId")
  public List<Topic> findTopicForLesson(
      @Param("lessonId") Integer id
  );
}
