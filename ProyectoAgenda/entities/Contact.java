package com.softtek.java.academy.entities;

public class Contact {

		private String id;
		private String firstName;
		private String lastName;
		private String motherName;
		private String email;
		private String phoneNumber;
		private ContactTypes contactTypes;
		
		public Contact()
		{
			this.contactTypes = ContactTypes.UNKNOWN;
		}
				
		
		public Contact(String id, String firstName, String lastName, String motherName, String email,
				String phoneNumber, ContactTypes contactTypes) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.motherName = motherName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.contactTypes = contactTypes;
		}



		public String getId()
		{
			return this.id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getMotherName() {
			return motherName;
		}
		public void setMotherName(String motherName) {
			this.motherName = motherName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public ContactTypes getContactTypes() {
			return contactTypes;
		}
		public void setContactTypes(ContactTypes contactTypes) {
			this.contactTypes = contactTypes;
		}
		public String toString()
		{
			StringBuilder sb = new StringBuilder();
			sb.append("Contact.id = " + this.getId() + "\n");
			sb.append("Contact.FirstName = " + this.getFirstName() + "\n");
			sb.append("Contact.MotherName = " + this.getMotherName() + "\n");
			sb.append("Contact.email = " + this.getEmail() + "\n");
			sb.append("Contact.PhoneNumber = " + this.getPhoneNumber() + "\n");
			sb.append("Contact.contactTypes = " + this.getContactTypes() + "\n");

			
			return sb.toString();
		}
}
