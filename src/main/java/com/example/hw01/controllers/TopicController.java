package com.example.hw01.controllers;

import com.example.hw01.models.Topic;
import com.example.hw01.repositories.TopicRepository;
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

@CrossOrigin(origins =  "http://localhost:4200/", allowCredentials =
    "true",
    allowedHeaders = "*")
@RestController
public class TopicController {
  @Autowired
  TopicRepository topicRepository;


  WidgetService service = new WidgetService();

//  List<Widget> widgets = service.getWidgets();


//  @PostMapping("/api/widgets")
//  public Widget createWidget(
//      @RequestBody Widget widget) {
//    return repository.save(widget);
//  }
//
//  @PutMapping("/api/widgets/{widgetId}")
//  public Widget updateWidget(
//      @PathVariable("widgetId") int widgetId,
//      @RequestBody Widget newWidget
//  ) {
//    Widget w = repository.findById(widgetId).get();
//    w.set(newWidget);
//    return repository.save(w);
//  }
//
//
//  @DeleteMapping("/api/widgets/{widgetId}")
//  public void deleteWidget(
//      @PathVariable("widgetId") int id) {
//    repository.deleteById(id);
//
//  }
//
//  @GetMapping("/api/widgets")
//  public List<Widget> findAllWidgets() {
//    return (List<Widget>)repository.findAll();
////    return widgets;
//  }
//
//  @GetMapping("/api/widgets/{widgetId}")
//  public Widget findWidgetById(
//      @PathVariable("widgetId") int id) {
//    Optional<Widget> w = repository.findById(id);
//    if(w.isPresent()) {
//      return w.get();
//    }
////    for (Widget w : widgets) {
////      if (w.getId() == id) {
////        return w;
////      }
////    }
//    return null;
//  }


  @GetMapping("/api/topics/{tid}")
  public Topic findTopicById(
      @PathVariable("tid") int id) {
    Optional<Topic> t = topicRepository.findById(id);
    if (t.isPresent()) {
      return t.get();
    }
    return null;
  }


  @GetMapping("/api/lessons/{lid}/topics")
  public List<Topic> findTopicsForLesson(
      @PathVariable("lid") int id) {
    List<Topic> t = topicRepository.findTopicForLesson(id);
    return t;
//    for (Widget w : widgets) {
//      if (w.getId() == id) {
//        return w;
//      }
//    }
  }



}



