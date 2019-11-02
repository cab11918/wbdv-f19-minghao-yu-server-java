package com.example.hw01.models;


public class Widget {

  private int id;
  private String name;


  public enum type {
    HEADING, LIST, PARAGRAPH, IMAGE, LINK
  }


  private int widgetType;
  private int order;
  private String text;
  private String src;
  private int size;


  public Widget(int id, String name, int order, String text, String src,
      int size, type type) {
    this.id = id;
    this.name = name;
    this.order = order;
    this.text = text;
    this.src = src;
    this.size = size;
    this.widgetType = -1;

    switch (type) {
      case HEADING:
        this.widgetType = 0;
        break;
      case LIST:
        this.widgetType = 1;
        break;
      case PARAGRAPH:
        this.widgetType = 2;
        break;
      case IMAGE:
        this.widgetType = 3;
        break;
      case LINK:
        this.widgetType = 4;
        break;
      default:
        this.widgetType = -1;

    }
  }


  public void setWidgetType(int widgetType) {
    this.widgetType = widgetType;
  }

  public int getWidgetType() {
    return widgetType;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setOrder(int order) {
    this.order = order;
  }

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

  public String getName() {
    return name;
  }

  public int getOrder() {
    return order;
  }

  public String getText() {
    return text;
  }

  public String getSrc() {
    return src;
  }

  public int getSize() {
    return size;
  }


}
