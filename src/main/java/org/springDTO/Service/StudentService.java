package org.springDTO.Service;

import org.modelmapper.ModelMapper;
import org.springDTO.DAO.CourseRepo;
import org.springDTO.DAO.StudentRepo;
import org.springDTO.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CourseRepo courseRepo;

    public List<Student> getStudents(){//getting Students no DTO
        return studentRepo.findAll();
    }
    public List<StudentDTO> getStudentsDTO(){

        List<Student> students= studentRepo.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for(Student student:students){
            StudentDTO studentDTO = modelMapper.map(student,StudentDTO.class);
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }

    public Student getStudent(Long id) {
        return studentRepo.findById(id).get();
    }
   /* public StudentDTO getStudentDTO(Long id) {//without modelMapper
        StudentDTO studentDTO = new StudentDTO();
        Student student= studentRepo.findById(id).get();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        return studentDTO;
    }*/

    public StudentResponse getStudentDTO(Long id){
        Student student = studentRepo.findById(id).get();
        StudentResponse studentResponse = new StudentResponse();
        studentResponse.setPhone("01113903660");
        //studentResponse = modelMapper.map(student,StudentResponse.class);
        modelMapper.map(student,studentResponse);
        return studentResponse;
    }

    public StudentCoursesDTO studentCourse(List<Long> ids) {
        Student student = courseRepo.findStudentByCourseID(ids.get(0));
        StudentCoursesDTO studentCoursesDTO = modelMapper.map(student,StudentCoursesDTO.class);

        /*studentCoursesDTO.setId(student.getId());
        studentCoursesDTO.setName(student.getName());*/

        List<Course> courses = courseRepo.listCoursesInIds(ids);
        for (Course c :courses){
            CourseResponse courseResponse = modelMapper.map(c,CourseResponse.class);
            /*courseResponse.setId(c.getId());
            courseResponse.setCost(c.getCost());*/
            studentCoursesDTO.getCourseList().add(courseResponse);

        }
        return studentCoursesDTO;
    }
}
