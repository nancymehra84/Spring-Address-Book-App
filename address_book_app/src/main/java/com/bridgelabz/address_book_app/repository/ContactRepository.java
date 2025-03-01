package com.bridgelabz.address_book_app.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bridgelabz.address_book_app.model.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
