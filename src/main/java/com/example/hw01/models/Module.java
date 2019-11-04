package com.example.hw01.models;

import java.util.List;

public class Module {

  private int id;
  private String title;
  private List<Lesson> lessons;

  public Module(int id, String title, List<Lesson> lessons) {
    this.id = id;
    this.title = title;
    this.lessons = lessons;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setLessons(List<Lesson> lessons) {
    this.lessons = lessons;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public List<Lesson> getLessons() {
    return lessons;
  }
}
