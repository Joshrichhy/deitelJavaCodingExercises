package chapterThree;

import java.util.Scanner;

public class HeartRateCalculator {
    private String firstName;
    private String lastName;
    private int dateOfBirth;

    Scanner scanner = new Scanner(System.in);

    public HeartRateCalculator(String firstName, String lastName, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName() {
        System.out.println("Enter First Name");
        this.firstName = scanner.nextLine();    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.println("Enter Last Name");
        this.lastName = scanner.nextLine();

    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        System.out.println("Enter Date of Birth");
        System.out.println("Enter Year");
        int year = scanner.nextInt();
        System.out.println("Enter Month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();

        int age = 2022 - year;
        // System.out.println(year + "/" + month + "/" + day );
        this.dateOfBirth = age;

    }
   // public int ageCalculator(int age){
     //   age = 2022 ;
       // return age;

    //}
    public double getheartRateCalculator(){
        //targetheartRate1 = 0.50 * (220 - this.dateOfBirth);
        //return targetheartRate1;
        double targetheartRate = 0.85 * (220 - this.dateOfBirth);
        //System.out.println(targetheartRate1 + "-" + targetheartRate2);

        return targetheartRate;


    }
    public int getmaxheartRate(){

         int maxheartRate =  220 - this.dateOfBirth;
         return maxheartRate;
    }
}
