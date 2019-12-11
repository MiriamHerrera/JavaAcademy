package com.softtek.java.academy.service;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactTypes;
import com.softtek.java.academy.util.Util;

public class ContactServicedataMemoryImpl implements ContactServiceData{
	
	private Contact[] contacts;
	private int currentIndex;
	private Util util;
	
	
	public ContactServicedataMemoryImpl()
	{
		contacts = new Contact [100];
		currentIndex = 0;
		util = new Util();
	}

	
	@Override
	public Contact createContact(Contact contact) {
		Contact newContact = new Contact(
				util.generateId(),
				contact.getFirstName(),
				contact.getLastName(),
				contact.getMotherName(),
				contact.getEmail(),
				contact.getPhoneNumber(),
				contact.getContactTypes()
				);
		contacts[currentIndex] = newContact;
		currentIndex++;		
		// TODO Auto-generated method stub
		return newContact;
	}

	@Override
	public Contact updateContact(String id, Contact contact) {
		// TODO Auto-generated method stub
		findById(id);
		for(int i=0; i < result.length; i++){
			if(result.i.equals(id)){
				contact.setEmail("leon@mail.com");
				contact.setPhoneNumber("811827346");
			}
		}
		return null;
	}

	@Override
	public boolean deleteContact(String id) {
		// TODO Auto-generated method stub
		findById(id);
		for(int i=0; i < result.length; i++){
			if(result.i.equals(id)){
			result.remove(i);
			}
		}
	}

	@Override
	public Contact[] findAll() {
		Contact[] storedContacts = new Contact [currentIndex];
		
		for(int i = 0; i < contacts.length; i++) {
			Contact c = contacts[i];
			if(c != null)
			{
				storedContacts[i] = c;
				
			}else
			{
				break;
			}
		} 
		return storedContacts;
	} 

	@Override
	public boolean findById(String id) {
		// TODO Auto-generated method stub
		int recordsFound = 0;

		for (Contact c : contacts) {
			if (c != null && c.generateId== id) {
				recordsFound++;
			} 
			else if (c == null) {
				break;
			}
			}
		if (recordsFound > 0) {
			Contact[] result = new Contact[recordsFound];
			int index = 0;
			
			for(Contact ct : contacts) {
				if(ct != null) {
					if(ct.generated() == id) {
						result[index] = ct;
						index++;
					}
				}
				else
				{
					break;
				}
			}
			return result;
		} 
		else {
			return null;
		}
		return false;
	}

	@Override
	public Contact findByEmail(String email) {
		// TODO Auto-generated method stub
		int recordsFound = 0;

		for (Contact c : contacts) {
			if (c != null && c.getEmail() == email) {
				recordsFound++;
			} 
			else if (c == null) {
				break;
			}
			}
		if (recordsFound > 0) {
			Contact[] result = new Contact[recordsFound];
			int index = 0;
			
			for(Contact ct : contacts) {
				if(ct != null) {
					if(ct.getEmail() == email) {
						result[index] = ct;
						index++;
					}
				}
				else
				{
					break;
				}
			}
			return result;
		} 
		else {
			return null;
		}
		return null;
	}

	@Override
	public Contact[] findByContactTypes(ContactTypes contactTypes) {

		int recordsFound = 0;

		for (Contact c : contacts) {
			if (c != null && c.getContactTypes() == contactTypes) {
				recordsFound++;
			} 
			else if (c == null) {
				break;
			}
			}
		if (recordsFound > 0) {
			Contact[] result = new Contact[recordsFound];
			int index = 0;
			
			for(Contact ct : contacts) {
				if(ct != null) {
					if(ct.getContactTypes() == contactTypes) {
						result[index] = ct;
						index++;
					}
				}
				else
				{
					break;
				}
			}
			return result;
		} 
		else {
			return null;
		}

		}

	
}
