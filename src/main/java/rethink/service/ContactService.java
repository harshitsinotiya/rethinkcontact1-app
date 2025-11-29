package rethink.service;

import java.util.List;

import rethink.contact.entity.Contact;

public interface ContactService {




	 Contact saveContact(Contact contact);
	    List<Contact> getAllContacts();

}
