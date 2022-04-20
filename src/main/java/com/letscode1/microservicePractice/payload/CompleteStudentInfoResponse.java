package com.letscode1.microservicePractice.payload;

import com.letscode1.microservicePractice.model.Student;
import com.letscode1.microservicePractice.payload.students.House;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CompleteStudentInfoResponse {

    private Integer id;

    private String name;

    private String gradeLevel;

    private String sortingHatKey;

    private House house;

    public CompleteStudentInfoResponse(Student student, House house) {
        this.id = student.getId();
        this.name = student.getName();
        this.gradeLevel = student.getGradeLevel();
        this.sortingHatKey = student.getSortingHatKey();
        this.house = house;
    }


}
