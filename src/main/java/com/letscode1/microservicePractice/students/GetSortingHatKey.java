package com.letscode1.microservicePractice.students;

import com.letscode1.microservicePractice.payload.students.SortingHatKey;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetSortingHatKey {
    public SortingHatKey execute() {

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api-harrypotter.herokuapp.com/sortinghat";

        return restTemplate.getForObject(url, SortingHatKey.class);
    }
}
