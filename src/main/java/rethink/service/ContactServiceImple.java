package rethink.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rethink.contact.entity.Contact;
import rethink.repository.RethinkRepository;

@Service
public class ContactServiceImple implements ContactService {

    @Autowired
    private RethinkRepository contactRepository;

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
