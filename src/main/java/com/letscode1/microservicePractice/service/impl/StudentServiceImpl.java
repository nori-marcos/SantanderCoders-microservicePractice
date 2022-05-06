package com.letscode1.microservicePractice.service.impl;

import com.letscode1.microservicePractice.model.Student;
import com.letscode1.microservicePractice.payload.CompleteStudentInfoResponse;
import com.letscode1.microservicePractice.payload.StudentRequest;
import com.letscode1.microservicePractice.payload.StudentResponse;
import com.letscode1.microservicePractice.payload.students.House;
import com.letscode1.microservicePractice.repository.StudentRepository;
import com.letscode1.microservicePractice.service.StudentService;
import com.letscode1.microservicePractice.students.GetHouse;
import com.letscode1.microservicePractice.students.GetSortingHatKey;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final GetSortingHatKey getSortingHatKey;

    @Autowired
    private final GetHouse getHouse;

    @Override
    public StudentResponse create(StudentRequest studentRequest) {

        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setGradeLevel(studentRequest.getGradeLevel());

        student.setSortingHatKey(getSortingHatKey.execute().getSortingHatChoice());

        student = studentRepository.save(student);

        StudentResponse studentResponse = new StudentResponse(student);

        return studentResponse;
    }

    @Override
//    Esta solucao nao funcionou, pois retornou o erro 500
    @Cacheable(cacheNames = "findId", key = "#id")
    public CompleteStudentInfoResponse getById(Integer id) {

        Student student = studentRepository.findById(id).orElseThrow();

        String houseKey = student.getSortingHatKey();

        House house = getHouse.execute(houseKey);

        CompleteStudentInfoResponse completeStudentInfoResponse = new CompleteStudentInfoResponse(student, house);

        return completeStudentInfoResponse;
    }

}
