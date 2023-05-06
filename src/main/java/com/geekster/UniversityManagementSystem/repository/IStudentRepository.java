package com.geekster.UniversityManagementSystem.repository;

import com.geekster.UniversityManagementSystem.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository {
    @Modifying
    @Query(value = "UPDATE Student set Department = :department where Student_Id = :studentId", nativeQuery = true)
    public void updateStudentDepartment(Integer studentId, String department);

    @Modifying
    @Query(value = "Delete from student where Student_id = :studentId",nativeQuery = true)
    void deleteStudentById(Integer studentId);

    @Query(value = "Select * from Student",nativeQuery = true)
    List<Student> getAllStudents();
    @Query(value = "Select * from Student where Student_id = :studentId ",nativeQuery = true)
    List<Student> getStudentById(Integer studentId);
}
