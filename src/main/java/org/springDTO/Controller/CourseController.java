package org.springDTO.Controller;

import org.springDTO.Models.Course;
import org.springDTO.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/allCourses")
    public List<Course> getAllCourses(){
        return courseService.getCourses();
    }
}
