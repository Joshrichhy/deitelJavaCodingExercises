package PhoneBookApplication;

public class Contact {
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String lastName, String firstName, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String toString(){
        return String.format("""
                        First Name:: %s
                        Last Name:: %s
                        Phone Number:: %s
                        Email Address: %s
                         """,
                firstName,  lastName, phoneNumber, emailAddress);
    }
}
