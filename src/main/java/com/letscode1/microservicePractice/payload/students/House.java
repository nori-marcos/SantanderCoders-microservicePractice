package com.letscode1.microservicePractice.payload.students;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class House implements Serializable {

    @JsonProperty("id")
    String id;

    @JsonProperty("name")
    String name;

    @JsonProperty("animal")
    String animal;

    @JsonProperty("founder")
    String founder;

    @JsonProperty("values")
    List<Value> values;

}
