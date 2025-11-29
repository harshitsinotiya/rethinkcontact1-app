package rethink.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rethink.contact.entity.Contact;


public interface RethinkRepository extends JpaRepository<Contact, Long> {
    // You can add custom query methods here if needed
}
