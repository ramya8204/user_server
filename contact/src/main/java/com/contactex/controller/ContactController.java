package com.contactex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.contactex.entity.Contact;
import com.contactex.service.ContactService;

import java.util.List;


@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // 🔹 Get all contacts
    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    // 🔹 Get contacts by userId
    @GetMapping("/user/{userId}")
    public List<Contact> getContactsByUserId(@PathVariable Long userId) {
        return contactService.getContactsByUserId(userId);
    }

    // 🔹 Save a new contact
    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

    // 🔹 Save a new contact for a specific user (optional)
    @PostMapping("/user/{userId}")
    public Contact saveContactForUser(@PathVariable Long userId, @RequestBody Contact contact) {
        contact.setUserId(userId);
        return contactService.saveContact(contact);
    }

    // 🔹 Update an existing contact
    @PutMapping("/{contactId}")
    public Contact updateContact(@PathVariable Long contactId, @RequestBody Contact contact) {
        return contactService.updateContact(contactId, contact);
    }
}


