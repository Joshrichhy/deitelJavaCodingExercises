package chapterThree;

public class HeartRateProfile {
    public static void main(String[] args) {
        HeartRateCalculator profile = new HeartRateCalculator("josh", "jay", 12&1&99);
        profile.setFirstName();
        profile.setLastName();
        profile.setDateOfBirth();

        double targetheartRate1 = 0.85 * profile.getmaxheartRate();
        double targetheartRate2 = 0.50 * profile.getmaxheartRate();



        System.out.println(profile.getFirstName() + " " + profile.getLastName());
        System.out.println(profile.getDateOfBirth() + " Years Old");
        System.out.println("Your maximum heart rate in beat per minute is " + profile.getmaxheartRate());
        System.out.printf("Your target heart Rate Range per minute is %.0f - %.0f", targetheartRate2, targetheartRate1);

    }
}
