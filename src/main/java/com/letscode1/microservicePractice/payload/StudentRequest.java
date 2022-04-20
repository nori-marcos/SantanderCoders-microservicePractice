package com.letscode1.microservicePractice.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {
    private String name;
    private String gradeLevel;
}
