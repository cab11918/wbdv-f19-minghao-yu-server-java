package com.example.hw01.models;
public class Course {

  private Integer id;
  private String title;

  public Integer getId() {
    return id;
  }

  public String getTitle() {
    return this.title;
  }

  public Course(Integer id, String title) {
    this.id = id;
    this.title = title;
  }
}
