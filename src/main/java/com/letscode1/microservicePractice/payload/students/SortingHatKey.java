package com.letscode1.microservicePractice.payload.students;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
public class SortingHatKey implements Serializable {
    @JsonProperty("sorting-hat-choice")
    private String sortingHatChoice;
}
