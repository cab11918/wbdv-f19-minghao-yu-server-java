package com.example.hw01.models;

import java.util.List;

public class Course {

  private Integer id;
  private String title;
  private List<Module> modules;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setModules(List<Module> modules) {
    this.modules = modules;
  }

  public List<Module> getModules() {
    return modules;
  }

  public String getTitle() {
    return this.title;
  }

  public Course(Integer id, String title, List<Module> modules) {
    this.id = id;
    this.title = title;
    this.modules = modules;

  }
}
