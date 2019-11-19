package com.example.hw01.repositories;

import com.example.hw01.models.Lesson;

import com.example.hw01.models.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WidgetRepository
    extends CrudRepository<Widget, Integer> {

  @Query("select widget from Widget widget where widget.topic.id=:topicId")
  public List<Widget> findWidgetsForTopic(
      @Param("topicId") Integer id
  );
}
