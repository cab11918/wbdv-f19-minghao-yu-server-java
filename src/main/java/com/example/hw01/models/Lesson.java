package com.example.hw01.models;

import java.util.List;

public class Lesson {

  private int id;
  private String title;

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setTopics(List<Topic> topics) {
    this.topics = topics;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public List<Topic> getTopics() {
    return topics;
  }

  public Lesson(int id, String title, List<Topic> topics) {
    this.id = id;
    this.title = title;
    this.topics = topics;
  }

  private List<Topic> topics;


}
