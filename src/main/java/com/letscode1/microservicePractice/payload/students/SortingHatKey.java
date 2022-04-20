package com.letscode1.microservicePractice.payload.students;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class SortingHatKey {
    @JsonProperty("sorting-hat-choice")
    private String sortingHatChoice;
}
