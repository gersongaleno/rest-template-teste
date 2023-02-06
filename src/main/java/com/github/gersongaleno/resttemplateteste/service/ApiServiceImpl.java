package com.github.gersongaleno.resttemplateteste.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService
{
    @Autowired
    private RestTemplate restTemplate;

    // inject value from application.properties
    @Value("${api.url}")
    private String API_URL;

    @Override
    public String getConselho() throws JsonProcessingException {

        ResponseEntity<String> response
                = restTemplate.getForEntity(API_URL, String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode name = root.path("slip");

        return String.valueOf(name.path("advice"));
    }
}