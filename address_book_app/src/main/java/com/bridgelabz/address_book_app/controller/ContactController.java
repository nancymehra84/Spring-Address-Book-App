package com.bridgelabz.address_book_app.controller;

import com.bridgelabz.address_book_app.model.Contact;
import com.bridgelabz.address_book_app.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    }
}
