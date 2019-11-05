package com.example.hw01;

import com.example.hw01.controllers.CourseController;
import com.example.hw01.models.Course;
import com.example.hw01.models.Lesson;
import com.example.hw01.models.Topic;
import com.example.hw01.models.Widget;
import com.example.hw01.models.Module;
import com.example.hw01.models.Widget.type;
import java.util.ArrayList;
import java.util.List;

public class CourseService {

  List<Course> courses = new ArrayList<>();

  public CourseService() {

    Widget w1 = new Widget(123, "widget1", 0, "text1", "source1", 1, type.HEADING);
    List<Widget> lw = new ArrayList<>();
    lw.add(w1);

    Topic t1 = new Topic(234, "Topic1", lw);
    List<Topic> lt = new ArrayList<>();
    lt.add(t1);

    Lesson l1 = new Lesson(345, "Lesson 1", lt);
    List<Lesson> ll = new ArrayList<>();
    ll.add(l1);

    Module m1 = new Module(456, "Lesson 1", ll);
    List<Module> lm = new ArrayList<>();
    lm.add(m1);

    Course c1 = new Course(567, "Course 1", lm);

    courses.add(c1);

  }

  public List<Course> getCourses() {
    return this.courses;
  }

  public List<Course> createCourse(Course c) {
    return new CourseController().createCourse(c);
  }

  public List<Course> findAllCourses() {
    return new CourseController().findAllCourses();
  }

  public Course findCourseById(int id) {
    return new CourseController().findCourseById(id);
  }

  public List<Course> updateCourse(int id, Course c) {
    return new CourseController().updateCourse(id, c);
  }

  public List<Course> deleteCourse(int id) {
    return new CourseController().deleteCourse(id);
  }

}
