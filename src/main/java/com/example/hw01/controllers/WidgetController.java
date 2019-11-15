package com.example.hw01.controllers;

import com.example.hw01.repositories.WidgetRepository;
import com.example.hw01.services.WidgetService;
import com.example.hw01.models.Widget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins =  "http://localhost:3000", allowCredentials =
    "true",
    allowedHeaders = "*")
@RestController
public class WidgetController {
  @Autowired
  WidgetRepository repository;


  WidgetService service = new WidgetService();

  List<Widget> widgets = service.getWidgets();


  @PostMapping("/api/widgets")
  public Widget createWidget(
      @RequestBody Widget widget) {
    return repository.save(widget);
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
    return (List<Widget>)repository.findAll();
//    return widgets;
  }

  @GetMapping("/api/widgets/{widgetId}")
  public Widget findWidgetById(
      @PathVariable("widgetId") int id) {
  Optional<Widget> w = repository.findById(id);
  if(w.isPresent()) {
    return w.get();
  }
//    for (Widget w : widgets) {
//      if (w.getId() == id) {
//        return w;
//      }
//    }
    return null;
  }


}
