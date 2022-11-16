package chapterThree;

public class NewNative {
    public static void main(String[] args) {
        Native josh = new Native();
        josh.setName("Joshrichhy");
        josh.setPhoneNumber("000000");
       String member = josh.getName();
       String myNumber = josh.getPhoneNumber();
        System.out.printf("%s %s", member, myNumber);

        josh.setName("Joshua Oluwakuse");
        String member1 = josh.getName();
        System.out.println(member1);

    }

}
