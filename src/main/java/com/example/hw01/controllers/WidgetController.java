package com.example.hw01.controllers;

import com.example.hw01.WidgetService;
import com.example.hw01.models.Widget;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://tranquil-hamlet-37825.herokuapp.com/api/widgets", allowCredentials =
    "true",
    allowedHeaders = "*")
@RestController
public class WidgetController {

  WidgetService service = new WidgetService();

  List<Widget> widgets = service.getWidgets();


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
