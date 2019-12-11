package com.softtek.java.academy.temporal;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactTypes;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServicedataMemoryImpl;

public class PlaceholderContacts {
	private Contact contact;
	private Contact friend;
	private Contact anotherFriend;
	
	public static void main(String[] args)
	{
		PlaceholderContacts p = new PlaceholderContacts();
		p.crearContactos();
		
		ContactServiceData csd = new ContactServicedataMemoryImpl();
		Contact myContact = csd.createContact(p.contact);
		Contact myfriendContact = csd.createContact(p.friend);
		
		Contact[] contacts = csd.findByContactTypes(ContactTypes.FRIEND);
		if(contacts != null) {
			for(Contact c: contacts) {
				System.out.println(c);
			}
		}else
		{
			System.out.print("No se encontraron contactos del tipo work " + ContactTypes.FRIEND );
		}
		
		//Contact friend = new Contact("1","Javier","Juarez", "Rosas","8127263791", "javier.juarez@gmail.com", ContactTypes.FRIEND);
		//System.out.println(contact);
		//System.out.println(friend);	
		//System.out.println(f.getId());
		//System.out.println(contact.getFirstName());
		//System.out.println(contact.getLastName());
		//System.out.println(contact.getMotherName());
		//System.out.println(contact.getEmail());
		//System.out.println(contact.getPhoneNumber());
		//System.out.println(contact.getContactTypes());
	}
	public void crearContactos() {
		contact = new Contact();
		contact.setFirstName("Miriam");
		contact.setLastName("Herrera");
		contact.setMotherName("Reyna");
		contact.setEmail("miriam@mail.com");
		contact.setPhoneNumber("61827346");
		friend = new Contact("1","Javier","Juarez", "Rosas","8127263791", "javier.juarez@gmail.com", ContactTypes.FRIEND);
		anotherFrien'¿ = new Contact("1","Javier","Juarez", "Rosas","8127263791", "javier.juarez@gmail.com", ContactTypes.FRIEND);
		
	}
}
