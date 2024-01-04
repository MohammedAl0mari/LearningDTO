package org.springDTO.Service;

import org.springDTO.DAO.CourseRepo;
import org.springDTO.Models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    public List<Course> getCourses(){
        return courseRepo.findAll();
    }
}
