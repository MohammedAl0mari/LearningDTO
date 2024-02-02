package org.springDTO.Controller;

import org.springDTO.Models.Student;
import org.springDTO.Models.StudentDTO;
import org.springDTO.Models.StudentResponse;
import org.springDTO.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/allStudents")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/allStudentsDTO")
    public List<StudentDTO> getAllStudentsDTO(){
        return studentService.getStudentsDTO();
    }
    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("id_student") Long id){
        return studentService.getStudent(id);
    }
    @GetMapping("/getStudentDTO")
    public StudentResponse getStudentDTO(@RequestParam("id_student") Long id){
        return studentService.getStudentDTO(id);
    }
}
