package PhoneBookApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneContact;
    @BeforeEach
    void setUp(){
        phoneContact = new PhoneBook();
        phoneContact.createContact("Joshua", "Oluwakuse", "07033490197", "kuse");
        phoneContact.createContact("Spencer", "Felix", "07033490197","josh@");

    }
    @Test
public void createContactTest(){

        assertNotNull(phoneContact.toString());
}
@Test
    public void viewContactTest(){
    String format="""
                        First Name:: Joshua
                        Last Name:: Oluwakuse
                        Phone Number:: 07033490197
                        Email Address: kuse
                        """;
        assertEquals(format, phoneContact.viewContact("Joshua").toString());
}
@Test
    public void countContactsInPhoneBook(){
        assertEquals(2,  phoneContact.countContacts());
}
@Test
    public void editContactTest(){
        phoneContact.editContact("Spencer", "Moyin", "Idanyimika", "08976");
    String editedContact = """
            First Name:: Moyin
            Last Name:: Idanyimika
            Phone Number:: 08976
            Email Address: josh@
            """;
       assertEquals(editedContact, phoneContact.viewContact("Moyin").toString());
}
@Test
public void deleteContactTest(){
        phoneContact.deleteContact("Spencer" +
                "");
        assertEquals(1, phoneContact.countContacts());
}
    @Test
    public void viewAllContactTest(){
        System.out.println(phoneContact.viewAllContact());
    }
}