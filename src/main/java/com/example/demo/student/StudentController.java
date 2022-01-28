package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}

// @RestController : Make the class to serve endpoints (Restfull)
// @GetMapping : to make the method an endpoint use
// @RequestMapping :  http://localhost:8080/api/v1/student
// @Autowired : Dependency injection > it says that studentService (16) should be autoweird the studentService of the parameter of the constructor
        // but also studentService (16) is not initiated (new StudentService) so the solution is using @Component in the class StudentService