package Assignment;

import java.util.Scanner;

public class NokiaE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println(""" 
                    Welcome to Your Nokia Phone
                    Press desired Number to navigate
                    1. Phone Book
                    2. Message
                    3. Chat
                    4. Call Register
                    5. Tones
                    6. Settings
                    7. Call Divert
                    8. Games
                    9. Calculator
                    10. Reminders
                    11. Clock
                    12. Profiles
                    13. Sim Services
                                    
                    0. Exit
                                    
                    Enter Preferred Number:  """);
            int menu = input.nextInt();
            while (menu != 0) {

                switch (menu) {

                    case 1 -> {
                        System.out.println("""
                                1. Search
                                2. Service Nos
                                3. Add name
                                4. Erase
                                5. Edit
                                6. Assign Tone
                                7. Send b'card
                                8. Options
                                9. Speed dials
                                10. Voice tags
                                                        
                                Enter Preferred Number: """);
                        int phoneBook = input.nextInt();
                        if (phoneBook == 0){ System.out.println(""" 
                    Welcome to Your Nokia Phone
                    Press desired Number to navigate
                    1. Phone Book
                    2. Message
                    3. Chat
                    4. Call Register
                    5. Tones
                    6. Settings
                    7. Call Divert
                    8. Games
                    9. Calculator
                    10. Reminders
                    11. Clock
                    12. Profiles
                    13. Sim Services
                                    
                    0. Exit
                                    
                    Enter Preferred Number:  """);
                             menu = input.nextInt();}

                        while (phoneBook != 0) {
                            switch (phoneBook) {
                                case 8:
                                    System.out.println("""
                                            1. Type of view
                                            2. Memory status""");
                                    phoneBook = input.nextInt();


                            }
                        }
                    }


                            case 2 -> {
                                System.out.println("""
                                        1. Write messages
                                        2. Inbox
                                        3. Outbox
                                        4. Picture messaging
                                        5. Templates
                                        6. Smileys
                                        7. Message settings
                                        8. info service
                                        9. Voice mailbox number
                                        10. Service command editor
                                                                
                                        Enter Preferred Number: """);
                                int messages = input.nextInt();
                               // while (messages != 0){
                                switch (messages) {
                                    case 7:
                                        System.out.println("""
                                                1. Set 1
                                                2. Common
                                                                                
                                                Enter Preferred Number: 
                                                """);
                                        int messageSettings = input.nextInt();
                                        switch (messageSettings) {
                                            case 1:
                                                System.out.println("""
                                                        1. Message centre number
                                                        2. Message sent as
                                                        3. Message validity""");
                                            case 2:
                                                System.out.println("""
                                                        1. Delivery reports
                                                        2. Reply via same centre
                                                        3. Character support
                                                         """);

                                        }
                                        break;
                                    case 8:
                                        System.out.println("info service");
                                        break;
                                    case 9:
                                        System.out.println("voice mailbox number");
                                        break;
                                    case 10:
                                        System.out.println("Service command editor");
                                }}

                    case 3 -> {
                        System.out.println("I love you");
                    }
                    case 4 -> {
                                System.out.println("""
                                        1. Missed calls
                                        2. Received calls
                                        3. Dialled numbers
                                        4. Erase recent call lists
                                        5. Show call duration
                                        6. Show call costs
                                        7. Call cost settings
                                        8. Prepaid credit
                                                                
                                        Enter Preferred Number: """);
                                int showCallDuration = input.nextInt();
                                switch (showCallDuration) {
                                    case 5:
                                        System.out.println("""
                                                1. Last call duration
                                                2. All calls' duration
                                                3. Received calls' duration
                                                4. Dialled calls' duration
                                                5. Clear timers""");
                                    case 6:
                                        System.out.println("""
                                                1. Last call cost
                                                2. All calls' cost
                                                3. Clear counters""");
                                    case 7:
                                        System.out.println("""
                                                1. Call cost limit
                                                2. Show costs in""");
                                }
                            }
                            case 5 -> System.out.println("""
                                    1. Ringing tone
                                    2. Ringing volume
                                    3. incoming call alert
                                    4. Composer
                                    5. Message alert tone
                                    6. Keypad tones
                                    7. Warning and game tones
                                    8. Vibrating alert
                                    9. Screen saver          
                                    """);
                            case 6 -> {
                                System.out.println("""
                                        1. Call settings
                                        2. Phone settings
                                        3. Security settings
                                        4. Restore factory settings
                                                                
                                        Enter Preferred Number: """);
                                int settings = input.nextInt();
                                switch (settings) {
                                    case 1: {
                                        System.out.println("""
                                                1. Automated redial
                                                2. Speed dialing
                                                3. Call waiting options
                                                4. Own number sending
                                                5. Phone line in use
                                                6. Automatic answer
                                                """);
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("""
                                                1. Language
                                                2. Cell info dislay
                                                3. Welcome note
                                                4. Network selection
                                                5. Lights
                                                6. Confirm SIM service actions""");
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("""
                                                1. PIN code request
                                                2. Call barring service
                                                3. Fixed dialling
                                                4. Closed user group
                                                5. Phone Security
                                                6. Change access codes""");
                                        break;
                                    }

                                }
                            }
                            case 7 -> System.out.println("Call diverted successfully");
                            case 8 -> System.out.println("Games Loading");
                            case 9 -> System.out.println("Calculator coming in a bit");
                            case 10 -> System.out.println("What will you like to be reminded about? well hold on, i will be back");
                            case 11 -> System.out.println("""
                                    1. Alarm Clock
                                    2. Clock settings
                                    3. Date setting
                                    4. Stopwatch
                                    5. Countdown timer
                                    6. Auto update of date and time             
                                    """);
                            case 12 -> System.out.println("Profiles loading");

                            case 13 -> System.out.println("Your Sim Service will be available shortly");


                        }

                    }
                }
            }

