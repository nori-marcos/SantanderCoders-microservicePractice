package com.letscode1.microservicePractice.service;

import com.letscode1.microservicePractice.payload.CompleteStudentInfoResponse;
import com.letscode1.microservicePractice.payload.StudentRequest;
import com.letscode1.microservicePractice.payload.StudentResponse;

public interface StudentService {
    StudentResponse create(StudentRequest studentRequest);

    CompleteStudentInfoResponse getById(Integer id);

}
