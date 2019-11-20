package com.example.hw01.controllers;

import com.example.hw01.repositories.CourseRepository;
import com.example.hw01.services.CourseService;
import com.example.hw01.models.Course;
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

@CrossOrigin(origins = "http://localhost:4200/", allowCredentials =
    "true",
    allowedHeaders = "*")
@RestController
public class CourseController {

  @Autowired
  CourseRepository repository;

//  CourseService service = new CourseService();

//  List<Course> courses = service.getCourses();


  @PostMapping("/api/courses")
  public Course createCourse(
      @RequestBody Course course) {

    return repository.save(course);
  }


  @PutMapping("/api/courses/{cid}")
  public Course updateCourse(
      @PathVariable("cid") int cid,
      @RequestBody Course course
  ) {
    Course c = repository.findById(cid).get();
    c.set(course);
    return repository.save(c);
  }


  @DeleteMapping("/api/courses/{cid}")
  public void deleteCourse(
      @PathVariable("cid") int cid) {

    repository.deleteById(cid);


  }


  @GetMapping("/api/courses")
  public List<Course> findAllCourses() {
    return (List<Course>) repository.findAll();
  }


  @GetMapping("/api/courses/{cid}")
  public Course findCourseById(
      @PathVariable("cid") int cid) {
    Optional<Course> c = repository.findById(cid);
    if (c.isPresent()) {
      return c.get();
    }
    return null;
  }


}
