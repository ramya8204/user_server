package com.contactex.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactex.entity.Contact;
import com.contactex.repository.ContactRepository;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getContactsByUserId(Long userId) {
        return contactRepository.findByUserId(userId);
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact updateContact(Long contactId, Contact contact) {
        Contact existing = contactRepository.findById(contactId)
            .orElseThrow(() -> new RuntimeException("Contact not found"));
        existing.setContactName(contact.getContactName());
        existing.setEmail(contact.getEmail());
        existing.setUserId(contact.getUserId());
        return contactRepository.save(existing);
    }

}



