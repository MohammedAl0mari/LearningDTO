package org.springDTO.config;

import org.springDTO.DAO.CourseRepo;
import org.springDTO.DAO.StudentRepo;
import org.springDTO.Models.Course;
import org.springDTO.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBInit implements CommandLineRunner {

    private StudentRepo studentRepo;
    private CourseRepo courseRepo;

    @Autowired
    public DBInit(StudentRepo studentRepo, CourseRepo courseRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        /*for(int i=1;i<=10;i++) {
            Student student = new Student();
            student.setName("Student"+i);
            student.setAge(String.valueOf(i));
            studentRepo.save(student);
        }
        List<Course> courses = courseRepo.findAll();
        int i=0;
        for(Course course:courses) {

            course.setName("course"+ ++i);

            courseRepo.save(course);
        }*/
    }
}
