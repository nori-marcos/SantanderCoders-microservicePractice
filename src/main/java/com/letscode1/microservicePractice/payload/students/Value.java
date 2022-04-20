package com.letscode1.microservicePractice.payload.students;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Value {
    @JsonProperty("name")
    String name;
}
