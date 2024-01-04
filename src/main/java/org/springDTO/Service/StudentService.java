package org.springDTO.Service;

import org.springDTO.DAO.StudentRepo;
import org.springDTO.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }
}
