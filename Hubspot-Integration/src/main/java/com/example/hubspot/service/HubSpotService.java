package com.example.hubspot.service;
import com.example.hubspot.model.Contact;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HubSpotService
{

    @Value("${hubspot.api.key}")
    private String apiKey;

    @Value("${hubspot.api.url}")
    private String apiUrl;
    private final RestTemplate restTemplate;
    public HubSpotService(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }
    public String createContact(Contact contact)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + apiKey);

        HttpEntity<Contact> entity = new HttpEntity<>(contact, headers);

        return restTemplate.exchange(apiUrl, HttpMethod.POST, entity, String.class).getBody();
    }
}


