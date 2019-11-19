package com.example.hw01.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "widgets")
public class Widget {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  @ManyToOne
  @JsonIgnore
  private Topic topic;


  public enum type {
    HEADING, LIST, PARAGRAPH, IMAGE, LINK
  }


  private String widgetType;
  //  private int order;
  private String text;
  private String src;
  private int size;

  public Widget() {
  }

  public Widget(int id, String title, int order, String text, String src,
      int size, type type) {
    this.id = id;
    this.title = title;
//    this.order = order;
    this.text = text;
    this.src = src;
    this.size = size;
    this.widgetType = "UNKNOWN";

    switch (type) {
      case HEADING:
        this.widgetType = "HEADING";
        break;
      case LIST:
        this.widgetType = "LIST";
        break;
      case PARAGRAPH:
        this.widgetType = "PARAGRAPH";
        break;
      case IMAGE:
        this.widgetType = "IMAGE";
        break;
      case LINK:
        this.widgetType = "LINK";
        break;
      default:
        this.widgetType = "UNKNOWN";

    }
  }

  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Topic topic) {
    this.topic = topic;
  }


  public void setWidgetType(String widgetType) {
    this.widgetType = widgetType;
  }

  public String getWidgetType() {
    return widgetType;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String name) {
    this.title = name;
  }

//  public void setOrder(int order) {
//    this.order = order;
//  }

  public void setText(String text) {
    this.text = text;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

//  public int getOrder() {
//    return order;
//  }

  public String getText() {
    return text;
  }

  public String getSrc() {
    return src;
  }

  public int getSize() {
    return size;
  }

  public void set(Widget newWidget) {
    this.id = newWidget.id;
    this.title = newWidget.title;
    this.text = newWidget.text;
    this.src = newWidget.src;
    this.size = newWidget.size;
    this.widgetType = newWidget.widgetType;
  }


}
