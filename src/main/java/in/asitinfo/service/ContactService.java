package in.asitinfo.service;

import java.util.List;

import in.asitinfo.entity.Contact;

public interface ContactService {

	public boolean saveContact(Contact contact);

	public List<Contact> getAllContact();

	public Contact getContactById(Integer contactID);

	public boolean deleteContactById(Integer contactID);

}
