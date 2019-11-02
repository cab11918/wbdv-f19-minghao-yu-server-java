package com.example.hw01.controllers;

import com.example.hw01.CourseService;
import com.example.hw01.models.Course;
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
public class CourseController {

  CourseService service = new CourseService();

  List<Course> courses = service.getCourses();


  @PostMapping("/api/courses")
  public List<Course> createCourse(
      @RequestBody Course course) {
    courses.add(course);
    return courses;
  }

  @PutMapping("/api/courses/{cid}")
  public List<Course> updateCourse(
      @PathVariable("cid") int cid,
      @RequestBody Course course
  ) {
    for (int i = 0; i < courses.size(); i++) {
      if (courses.get(i).getId() == cid) {
        courses.set(i, course);
      }
    }
    return courses;
  }


  @DeleteMapping("/api/courses/{cid}")
  public List<Course> deleteCourse(
      @PathVariable("cid") int cid) {
    int index = -1;

    for (int i = 0; i < courses.size(); i++) {
      if (courses.get(i).getId() == cid) {
        index = i;
      }
    }
    courses.remove(index);
    return courses;

  }

  @GetMapping("/api/courses")
  public List<Course> findAllCourses() {
    return courses;
  }

  @GetMapping("/api/courses/{cid}")
  public Course findCourseById(
      @PathVariable("cid") int cid) {
    for (Course c : courses) {
      if (c.getId() == cid) {
        return c;
      }
    }
    return null;
  }


}
