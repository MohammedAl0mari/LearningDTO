package org.springDTO.Service;

import org.springDTO.DAO.CourseRepo;
import org.springDTO.Models.Course;
import org.springDTO.Models.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public List<Course> getCourses(){
        return courseRepo.findAll();
    }

    public List<CourseDTO> getCoursesDTO(){
        List<Course> courses = courseRepo.findAll();
        List<CourseDTO> courseDTOS = new ArrayList<>();
        for(int i=0;i<courses.size();i++){
            CourseDTO courseDTO = new CourseDTO();
            courseDTO.setId(courses.get(i).getId());
            courseDTO.setName(courses.get(i).getName());
            courseDTO.setCost(courses.get(i).getCost());
            courseDTOS.add(courseDTO);
        }
        return courseDTOS;
    }

    public List<Course> getCoursesAfterR(){
        return courseRepo.findAll();
    }
}
