package com.example.demo.Service;

import java.util.List;

import com.example.demo.controller.Course;

public interface CourseService {
    public List<Course> getCourses();  
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    
}
