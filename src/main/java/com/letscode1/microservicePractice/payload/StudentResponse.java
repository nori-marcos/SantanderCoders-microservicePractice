package com.letscode1.microservicePractice.payload;

import com.letscode1.microservicePractice.model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class StudentResponse implements Serializable {
    private Integer id;

    private String name;

    private String gradeLevel;

    private String sortingHatKey;

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.gradeLevel = student.getGradeLevel();
        this.sortingHatKey = student.getSortingHatKey();
    }
}
