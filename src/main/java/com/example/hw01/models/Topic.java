package com.example.hw01.models;

import java.util.List;

public class Topic {

  private int id;
  private String title;
  private List<Widget> widgets;

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setWidgets(List<Widget> widgets) {
    this.widgets = widgets;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public List<Widget> getWidgets() {
    return widgets;
  }

  public Topic(int id, String title, List<Widget> widgets) {
    this.id = id;
    this.title = title;
    this.widgets = widgets;
  }
}
