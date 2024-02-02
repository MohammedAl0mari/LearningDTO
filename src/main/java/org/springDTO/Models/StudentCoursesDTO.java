package org.springDTO.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class StudentCoursesDTO {
    private long id;
    private String name;
    private List<CourseResponse> courseList;
}
