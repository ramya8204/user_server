package com.contactex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contactex.entity.Contact;

@Service
public interface ContactService {
    List<Contact> getContactsByUserId(Long userId);
    Contact saveContact(Contact contact);
    List<Contact> getAllContacts();
    Contact updateContact(Long contactId, Contact contact);

}
