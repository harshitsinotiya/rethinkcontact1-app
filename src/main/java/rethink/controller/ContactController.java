package rethink.controller;

import org.springframework.web.bind.annotation.*;
import rethink.service.ContactService;
import rethink.contact.entity.Contact;
import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = {
        "https://indexing-3kdj.onrender.com",
        "http://127.0.0.1:5501",
        "http://localhost:5501"
})
 // safe CORS
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        List<Contact> contacts = service.getAllContacts();
        System.out.println("GET /contacts called, returning " + contacts.size() + " contacts");
        contacts.forEach(c -> System.out.println(c.getName() + " - " + c.getContactNo()));
        return contacts;
    }

    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        System.out.println("POST /contacts called with: " + contact.getName() + ", " + contact.getContactNo());
        Contact saved = service.saveContact(contact);
        System.out.println("Saved contact ID: " + saved.getId());
        return saved;
    }
}
