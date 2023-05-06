package com.geekster.UniversityManagementSystem.service;

import com.geekster.UniversityManagementSystem.model.Department;
import com.geekster.UniversityManagementSystem.model.Student;
import com.geekster.UniversityManagementSystem.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.EnumSet;
import java.util.List;

@Service
public class StudentServices {
    @Autowired
    IStudentRepository studentRepository;
    public String addStudent(Student student) {
        studentRepository.save(student);
        if(student==null){
            return "enter valid Student";
        }
        else {
            return "Student with studentId : "+student.getStudentId()+" added to database";
        }
    }

    public String updateStudentDepartment(Integer studentId, String department) {

        for(Department d : Department.values()){
            if(d.name().equals(department)){
                studentRepository.updateStudentDepartment(studentId,department);
                return "Data update!!!!!!";
            }
        }


        return "Enter Valid Department Type";
    }

    public String deleteStudentById(Integer studentId) {
        studentRepository.deleteStudentById(studentId);
        return "Student Data Deleted!!!!!!!!";
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public List<Student> getStudentById(Integer studentId) {

        return studentRepository.getStudentById(studentId);
    }
}
