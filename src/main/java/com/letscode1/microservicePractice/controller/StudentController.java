package com.letscode1.microservicePractice.controller;

import com.letscode1.microservicePractice.payload.CompleteStudentInfoResponse;
import com.letscode1.microservicePractice.payload.StudentRequest;
import com.letscode1.microservicePractice.payload.StudentResponse;
import com.letscode1.microservicePractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public StudentResponse create(@RequestBody StudentRequest studentRequest) {
        return studentService.create(studentRequest);
    }

    @GetMapping("/{id}")
    public CompleteStudentInfoResponse getById(@PathVariable Integer id) {
        return studentService.getById(id);
    }

}
