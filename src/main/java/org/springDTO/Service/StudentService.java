package org.springDTO.Service;

import org.springDTO.DAO.StudentRepo;
import org.springDTO.Models.Student;
import org.springDTO.Models.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
    public List<StudentDTO> getStudentsDTO(){

        List<Student> students= studentRepo.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for(Student student:students){
            StudentDTO studentDTO =new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setName(student.getName());
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }
}
