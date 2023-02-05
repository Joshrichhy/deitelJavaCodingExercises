package PhoneBookApplication;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {
    ArrayList <Contact> contacts = new ArrayList<>();

    public void createContact(String firstName, String lastName, String phoneNumber, String email){
         Contact newContact = new Contact(lastName, firstName, phoneNumber);
        newContact.setEmailAddress(email);
        contacts.add(newContact);
    }

    public Contact viewContact(String firstname) {
        for (Contact contact: contacts ) {
            if (firstname.equalsIgnoreCase(contact.getFirstName())){
                return contact;}
        }

        return null;
    }

    public int countContacts() {
        return contacts.size();
    }

    public void editContact(String name, String newFirstName, String newLastName, String newPhoneNumber) {
        int number = 0;
        for  (int index = 0; index < contacts.size(); index++){
            if (Objects.equals(contacts.get(index).getFirstName(), name)){number = index; }}
        Contact edited = contacts.get(number);
        edited.setPhoneNumber(newPhoneNumber);
        edited.setLastName(newLastName);
        edited.setFirstName(newFirstName);
        contacts.set(number, edited);
    }

    public void deleteContact(String firstName) {
        int number = 0;
        for  (int index = 0; index < contacts.size(); index++){
            if (contacts.get(index).getFirstName().equals(firstName))
            {number = index;}}
            if (!contacts.get(number).getFirstName().equals(firstName)) throw new IllegalArgumentException("Invalid Contact Information");
            contacts.remove(number);


    }

    public String viewAllContact(){
        return contacts.toString();
    }
}
