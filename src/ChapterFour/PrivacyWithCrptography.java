package ChapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class PrivacyWithCrptography {

   static int [] numberToBeEncrypted = new int[4];
    static Scanner input = new Scanner(System.in);
    static int [] encryptedNumber = new int[4];

    static int [] numberToBeDecryptedNumber = new int[4];

    static int [] decryptedNumber = new int[4];

    public static void main(String[] args) {


        System.out.println("Enter your 4 digit");
        String number = input.next();
        String theNumber = encryption(number);
        System.out.println(theNumber);

       String backToOriginalNumber = decryption(theNumber);
        System.out.println(backToOriginalNumber);






    }
    public static String encryption(String number){

        for (int index = 0; index < numberToBeEncrypted.length; index++) {
            numberToBeEncrypted[index] = Integer.parseInt(String.valueOf(number.charAt(index))) ;}

        for (int eachNumber = 0; eachNumber < numberToBeEncrypted.length ; eachNumber++) {
            encryptedNumber[eachNumber] = (numberToBeEncrypted[eachNumber] + 7) % 10;

        }

        System.out.println(Arrays.toString(numberToBeEncrypted));
        System.out.println(Arrays.toString(encryptedNumber));

        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int numberFour = 0;

        for (int i = 0; i < encryptedNumber.length; i++) {
            if (i == 0){ numberOne = encryptedNumber[i];}
            else if (i == 1){ numberTwo = encryptedNumber[i];}
            else if (i == 2){ numberThree = encryptedNumber[i];}
            else if (i == 3){ numberFour = encryptedNumber[i];}
        }


        for (int j = 0; j < encryptedNumber.length; j++) {
            if (j == 0){encryptedNumber[j] = numberThree;}
            else if (j == 1){encryptedNumber[j] = numberFour;}
            else if (j == 2){ encryptedNumber[j] = numberOne;}
            else if (j == 3){encryptedNumber[j] = numberTwo;}

        }
        System.out.println(Arrays.toString(encryptedNumber));
        StringBuilder newEncryptedNumber = new StringBuilder();

        for (int i = 0; i < encryptedNumber.length; i++) {
            newEncryptedNumber.append(encryptedNumber[i]);

        }

        return newEncryptedNumber.toString();
    }

    public static String decryption(String number){
        for (int index = 0; index < numberToBeEncrypted.length; index++) {
            numberToBeEncrypted[index] = Integer.parseInt(String.valueOf(number.charAt(index))) ;}

        for (int eachNumber = 0; eachNumber < numberToBeEncrypted.length ; eachNumber++) {
            decryptedNumber[eachNumber] = (numberToBeEncrypted[eachNumber] -7) * 10;

        }

        System.out.println(Arrays.toString(numberToBeEncrypted));
        System.out.println(Arrays.toString(decryptedNumber));

        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        int numberFour = 0;

        for (int i = 0; i < decryptedNumber.length; i++) {
            if (i == 0){ numberOne = decryptedNumber[i];}
            else if (i == 1){ numberTwo = decryptedNumber[i];}
            else if (i == 2){ numberThree = decryptedNumber[i];}
            else if (i == 3){ numberFour = decryptedNumber[i];}
        }

        // System.out.println(numberOne + " " + numberTwo + " " + " " + numberThree + " " + numberFour);

        for (int j = 0; j < encryptedNumber.length; j++) {
            if (j == 0){decryptedNumber[j] = numberThree;}
            else if (j == 1){decryptedNumber[j] = numberFour;}
            else if (j == 2){ decryptedNumber[j] = numberOne;}
            else if (j == 3){decryptedNumber[j] = numberTwo;}

        }
        String newDecryptedNumber = Arrays.toString(decryptedNumber);

        return newDecryptedNumber;
    }
}
