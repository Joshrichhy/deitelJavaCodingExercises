package chapterThree;

public class Native {
    private String name;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
        System.out.println("You are welcome");
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
