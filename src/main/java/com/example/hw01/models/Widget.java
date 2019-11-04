package com.example.hw01.models;


public class Widget {

  private int id;
  private String name;


  public enum type {
    HEADING, LIST, PARAGRAPH, IMAGE, LINK
  }


  private String widgetType;
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


  public void setWidgetType(String widgetType) {
    this.widgetType = widgetType;
  }

  public String getWidgetType() {
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
