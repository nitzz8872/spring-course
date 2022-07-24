package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.controller.Course;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(145,"Java CoreCourse", "this course is about java"));
        list.add(new Course(146,"Spring boot", "this course is about springboot"));
    }



    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId){
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course; 
                break;
            }
        }
        return c;

    }
    @Override
    public Course addCourse(Course course) {
     list.add(course);
     return course;

    }
    
}
 