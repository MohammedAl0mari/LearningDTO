package org.springDTO.Service;

import org.modelmapper.ModelMapper;
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

    @Autowired
    private ModelMapper modelMapper;

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

    public StudentDTO getStudentDTO(Long id) {//with modelMapper
        Student student= studentRepo.findById(id).get();
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setPhone("0792928753");
        modelMapper.map(student,studentDTO);
        return studentDTO;
    }
}
