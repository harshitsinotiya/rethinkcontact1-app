package rethink.controller;

import org.springframework.web.bind.annotation.*;
import rethink.service.ContactService;
import rethink.contact.entity.Contact;
import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin(origins = "https://frontendrethinking-3et7.vercel.app") // Allow your frontend
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }

    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return service.saveContact(contact);
    }
}
