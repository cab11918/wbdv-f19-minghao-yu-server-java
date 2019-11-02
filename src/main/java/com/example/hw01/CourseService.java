package com.example.hw01;

import com.example.hw01.models.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
  List<Course> courses = new ArrayList<>();

  public CourseService() {

  Course c1 = new Course(123,"course 1");
  Course c2 = new Course(234,"course 2");
  Course c3 = new Course(345,"course 3");
  Course c4 = new Course(456,"course 4");
  Course c5 = new Course(567,"course 5");


  courses.add(c1);
  courses.add(c2);
  courses.add(c3);
  courses.add(c4);
  courses.add(c5);
}

public List<Course> getCourses() {
  return this.courses;
}

}
