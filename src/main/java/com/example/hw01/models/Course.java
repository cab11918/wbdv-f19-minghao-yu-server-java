package com.example.hw01.models;

import java.util.List;

public class Course {

  private Integer id;
  private String title;

  public Integer getId() {
    return id;
  }

  public Course(Integer id, String title) {
    this.id = id;
    this.title = title;
  }
}
