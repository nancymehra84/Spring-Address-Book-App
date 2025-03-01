package com.bridgelabz.address_book_app.service;

import com.bridgelabz.address_book_app.model.Contact;
import com.bridgelabz.address_book_app.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
