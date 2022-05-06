package com.letscode1.microservicePractice.payload.students;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Value implements Serializable {
    @JsonProperty("name")
    String name;
}
