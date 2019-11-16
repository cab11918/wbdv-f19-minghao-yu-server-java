package com.example.hw01.services;

import com.example.hw01.controllers.CourseController;
import com.example.hw01.models.Course;
import com.example.hw01.models.Lesson;
import com.example.hw01.models.Topic;
import com.example.hw01.models.Widget;
import com.example.hw01.models.Module;
import java.util.ArrayList;
import java.util.List;

public class CourseService {

  List<Course> courses = new ArrayList<>();

  public CourseService() {

  }

}

//  public List<Course> getCourses() {
//    return this.courses;
//  }

//  public List<Course> createCourse(Course c) {
//    return new CourseController().createCourse(c);
//  }
//
//  public List<Course> findAllCourses() {
//    return new CourseController().findAllCourses();
//  }
//
//  public Course findCourseById(int id) {
//    return new CourseController().findCourseById(id);
//  }
//
//  public List<Course> updateCourse(int id, Course c) {
//    return new CourseController().updateCourse(id, c);
//  }
//
//  public List<Course> deleteCourse(int id) {
//    return new CourseController().deleteCourse(id);
//  }
//
//}
