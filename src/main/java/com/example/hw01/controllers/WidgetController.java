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

@CrossOrigin(origins =  "http://localhost:4200/")
@RestController
public class WidgetController {
  @Autowired
  WidgetRepository widgetRepository;


  WidgetService service = new WidgetService();

//  List<Widget> widgets = service.getWidgets();


  @PostMapping("/api/widgets")
  public Widget createWidget(
      @RequestBody Widget widget) {
    return widgetRepository.save(widget);
  }

  @PutMapping("/api/widgets/{widgetId}")
  public Widget updateWidget(
      @PathVariable("widgetId") int widgetId,
      @RequestBody Widget newWidget
  ) {
   Widget w = widgetRepository.findById(widgetId).get();
   w.set(newWidget);
  return widgetRepository.save(w);
  }


  @DeleteMapping("/api/widgets/{widgetId}")
  public void deleteWidget(
      @PathVariable("widgetId") int id) {
    widgetRepository.deleteById(id);

  }

  @GetMapping("/api/widgets")
  public List<Widget> findAllWidgets() {
    return (List<Widget>)widgetRepository.findAll();
//    return widgets;
  }

  @GetMapping("/api/widgets/{widgetId}")
  public Widget findWidgetById(
      @PathVariable("widgetId") int id) {
  Optional<Widget> w = widgetRepository.findById(id);
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


  @GetMapping("/api/topics/{tid}/widgets")
  public List<Widget> findWidgetsForTopic(
      @PathVariable("tid") int id) {
    List<Widget> w = widgetRepository.findWidgetsForTopic(id);
    return w;
//    for (Widget w : widgets) {
//      if (w.getId() == id) {
//        return w;
//      }
//    }
  }



}



