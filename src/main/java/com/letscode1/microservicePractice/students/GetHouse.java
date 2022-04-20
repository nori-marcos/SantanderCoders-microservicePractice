package com.letscode1.microservicePractice.students;

import com.letscode1.microservicePractice.payload.students.House;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class GetHouse {

    public House execute(String chavecasa) {
        String url = "https://api-harrypotter.herokuapp.com/house/{chavecasa}";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<House> houseResponseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, House.class, chavecasa);

        if (houseResponseEntity.getStatusCode().isError()) {
            //TODO lançar erro proprio
            return null;
        }

        return houseResponseEntity.getBody();
    }

}
