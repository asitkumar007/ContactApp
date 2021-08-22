package in.asitinfo.service;

import java.util.List;

import in.asitinfo.entity.Contact;
import in.asitinfo.repository.ContactRepository;

public class ContactServiceImpl implements ContactService {

	private ContactRepository repo;
	@Override
	public boolean saveContact(Contact contact) {
		return repo.save(contact) != null;
	}

	@Override
	public List<Contact> getAllContact() {
		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactID) {
		return repo.getById(contactID);

	}

	@Override
	public boolean deleteContactById(Integer contactID) {
		return repo.deleteById(contactID);
	}

}

