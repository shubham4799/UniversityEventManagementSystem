package com.geekster.UniversityManagementSystem.controller;

import com.geekster.UniversityManagementSystem.model.Student;
import com.geekster.UniversityManagementSystem.service.StudentServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/uni/student")
public class StudentController {
    @Autowired
    StudentServices studentServices;
    @PostMapping(value = "/addStudent")
    public String addStudent(@RequestBody @Valid Student student){
        return studentServices.addStudent(student);
    }
    @PutMapping(value = "/updateStudentDepartment/{studentId}/{department}")
    public String updateStudentDepartment(@PathVariable Integer studentId,@PathVariable String department){
        return studentServices.updateStudentDepartment(studentId,department);
    }
    @DeleteMapping(value = "/deleteStudent/studentId/{studentId}")
    public String deleteStudentById(@PathVariable Integer studentId){
        return studentServices.deleteStudentById(studentId);
    }
    @GetMapping(value = "/getAllStudents")
    public List<Student> getAllStudents(){
        return studentServices.getAllStudents();
    }
    @GetMapping(value = "/getStudentById/{studentId}")
    public List<Student> getStudentById(@PathVariable Integer studentId){
        return studentServices.getStudentById(studentId);
    }

}
