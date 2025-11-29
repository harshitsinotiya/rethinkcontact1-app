package rethink.controller;

import org.springframework.web.bind.annotation.*;
import rethink.service.ContactService;
import rethink.contact.entity.Contact;
import java.util.List;

@CrossOrigin(
        origins = "https://timely-moxie-6ee490.netlify.app",
        allowedHeaders = "*",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS}
)
@RestController
@RequestMapping("/contacts")
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
