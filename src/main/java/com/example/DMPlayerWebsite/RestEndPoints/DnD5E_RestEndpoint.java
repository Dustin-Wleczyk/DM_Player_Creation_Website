package com.example.DMPlayerWebsite.RestEndPoints;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("")
public class DnD5E_RestEndpoint {


    @Value("")
    private String apiKey;

//    @Autowired
//    private RestTemplate restTemplate;




}
