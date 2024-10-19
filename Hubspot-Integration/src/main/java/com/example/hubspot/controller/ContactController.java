package com.example.hubspot.controller;
import com.example.hubspot.model.Contact;
import com.example.hubspot.service.HubSpotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacts")
public class ContactController
{
    private final HubSpotService hubSpotService;
    public ContactController(HubSpotService hubSpotService)
    {
        this.hubSpotService = hubSpotService;
    }
    @PostMapping
    public ResponseEntity<String> createContact(@RequestBody Contact contact)
    {
        String response = hubSpotService.createContact(contact);
        return ResponseEntity.ok(response);
    }
}

