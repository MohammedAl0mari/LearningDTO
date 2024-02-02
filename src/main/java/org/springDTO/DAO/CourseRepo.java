package org.springDTO.DAO;

import org.springDTO.Models.Course;
import org.springDTO.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
    @Query("select c.student from Course c where c.id = ?1")
    public Student findStudentByCourseID(Long id);

    @Query("select c from Course c where c.id in (:coursesId)")
    public List<Course> listCoursesInIds(List<Long> coursesId);
}
