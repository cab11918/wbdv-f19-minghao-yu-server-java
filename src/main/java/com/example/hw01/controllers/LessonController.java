package com.example.hw01.controllers;

import com.example.hw01.models.Lesson;
import com.example.hw01.models.Module;
import com.example.hw01.repositories.LessonRepository;
import com.example.hw01.repositories.ModuleRepository;
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

@CrossOrigin(origins =  "*")
@RestController
public class LessonController {
  @Autowired
  LessonRepository lessonRepository;
  ModuleRepository moduleRepository;


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

  @GetMapping("/api/lessons/{lid}")
  public Lesson findLessonById(
      @PathVariable("lid") int id) {
    Optional<Lesson> l = lessonRepository.findById(id);
    if (l.isPresent()) {
      return l.get();
    }
    return null;
  }


    @GetMapping("/api/modules/{mid}/lessons")
    public List<Lesson> findLessonsForModule(
    @PathVariable("mid") int id) {
    List<Lesson> l = lessonRepository.findLessonForModule(id);
      return l;
//    for (Widget w : widgets) {
//      if (w.getId() == id) {
//        return w;
//      }
//    }
  }



}



