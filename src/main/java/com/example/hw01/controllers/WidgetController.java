package com.example.hw01.controllers;

import com.example.hw01.models.Widget;
import com.example.hw01.models.Widget.type;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WidgetController {

  List<Widget> widgets = new ArrayList<>();

  WidgetController() {

    Widget w1 = new Widget(123, "widget1", 0, "text1", "source1", 1, type.HEADING);
    Widget w2 = new Widget(234, "widget2", 1, "text2", "source2", 1, type.PARAGRAPH);
    Widget w3 = new Widget(345, "widget3", 2, "text3", "source3", 1, type.LIST);
    
    Widget w4 = new Widget(456, "widget4", 3, "text4", "source4", 1, type.IMAGE);
    Widget w5 = new Widget(567, "widget5", 4, "text5", "source5", 1, type.LINK);

    widgets.add(w1);
    widgets.add(w2);
    widgets.add(w3);
    widgets.add(w4);
    widgets.add(w5);
  }


  @PostMapping("/api/widgets")
  public List<Widget> createWidget(
      @RequestBody Widget widget) {
    widgets.add(widget);
    return widgets;
  }

  @PutMapping("/api/widgets/{widgetId}")
  public List<Widget> updateWidget(
      @PathVariable("widgetId") int widgetId,
      @RequestBody Widget newWidget
  ) {
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId() == widgetId) {
        widgets.set(i, newWidget);
      }
    }
    return widgets;
  }


  @DeleteMapping("/api/widgets/{widgetId}")
  public List<Widget> deleteWidget(
      @PathVariable("widgetId") int id) {
    int index = -1;

    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId() == id) {
        index = i;
      }
    }
    widgets.remove(index);
    return widgets;

  }

  @GetMapping("/api/widgets")
  public List<Widget> findAllWidgets() {
    return widgets;
  }

  @GetMapping("/api/widgets/{widgetId}")
  public Widget findWidgetById(
      @PathVariable("widgetId") int id) {
    for (Widget w : widgets) {
      if (w.getId() == id) {
        return w;
      }
    }
    return null;
  }


}
