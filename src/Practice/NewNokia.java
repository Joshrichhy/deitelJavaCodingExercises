package Practice;

import java.util.Scanner;

public class NewNokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(""" 
                Welcome to Your Nokia Phone
                Press any Number to go to the main menu
                """);
        int mainMenu = input.nextInt();
        while (mainMenu != 0){
            System.out.println(""" 
                Wow, You are here
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
                                
                Enter Preferred Number:  """);
            int menu = input.nextInt();
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
                    int options = input.nextInt();
                    if (options != 8){
                        System.out.println("""
                                Sorry Lover, We are still working on this option
                                
                                kindly press 0 to the previous menu""");
                        options = input.nextInt();
                    }
                    while (options != 0){
                    switch(options){
                        case 8:
                            System.out.println("""
                                1. Type of view
                                2. Memory status
                                
                                Press 0 to go back to the previous Option""");
                           int viewStatus = input.nextInt();
                           if (viewStatus == 0) {
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
                                options = input.nextInt();
                               if (options != 8 && options != 0){
                                   System.out.println("""
                                Sorry Lover, We are still working on this option
                                
                                kindly press 0 to the previous menu""");
                                   options = input.nextInt();
                               }
                           }
                    }}}
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
                    if (messages != 7 && messages != 0){
                        System.out.println("""
                                Sorry Lover, We are still working on this option
                                
                                kindly press 0 to the previous menu""");
                        messages = input.nextInt();
                    }
                while (messages != 0){
                    switch (messages){
                        case 7:
                            System.out.println("""
                                1. Set 1
                                2. Common
                                
                                Enter Preferred Number: 
                                """);
                            int messageSettings = input.nextInt();

                            while (messageSettings != 0){
                            switch (messageSettings){
                                case 1:
                                    System.out.println("""
                                        1. Message centre number
                                        2. Message sent as
                                        3. Message validity""");
                                    int messageSettings1 = input.nextInt();
                                    if (messageSettings1 == 0){ System.out.println("""
                                1. Set 1
                                2. Common
                                
                                Enter Preferred Number: 
                                """);
                                         messageSettings = input.nextInt();
                                        if (messageSettings < 0 || messageSettings > 2){
                                            System.out.println("invalid input, kindly input the right number");
                                            messageSettings = input.nextInt();}

                                        if (messageSettings == 0){System.out.println("""
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
                                            messages = input.nextInt();
                                            if (messages != 7 && messages != 0){
                                                System.out.println("""
                                Sorry Lover, We are still working on this option
                                
                                kindly press 0 to the previous menu""");
                                                messages = input.nextInt();
                                            }
                                        }
                                    }break;
                                case 2:
                                    System.out.println("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                         """);
                                    int messageSettings2 = input.nextInt();
                                    if (messageSettings2 == 0){
                                        System.out.println("""
                                1. Set 1
                                2. Common
                                
                                Enter Preferred Number: 
                                """);
                                         messageSettings = input.nextInt();
                                        if (messageSettings < 0 || messageSettings > 2){
                                            System.out.println("invalid input, kindly input the right number");
                                            messageSettings = input.nextInt();
                                        }
                                    }

                            }}break;
                        case 8:
                            System.out.println("info service");
                            System.out.println("press any number to go back");
                             input.nextInt();
                            break;

                        case 9:
                            System.out.println("voice mailbox number");
                            System.out.println("press any number to go back");
                             input.nextInt();
                            break;
                        case 10:
                            System.out.println("Service command editor");
                            System.out.println("press any number to go back");
                             input.nextInt();
                    }break;
                }}

                case 3 ->{
                        System.out.println("I love you");
                System.out.println("press any number to go back");
                input.nextInt();}

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

                    if (showCallDuration < 5 || showCallDuration > 7){
                        System.out.println("""
                                Sorry Lover, We are still working on this option
                                
                                kindly press 0 to the previous menu""");
                        showCallDuration = input.nextInt();

                    }while (showCallDuration != 0){
                    switch (showCallDuration) {
                        case 5:
                            System.out.println("""
                                    1. Last call duration
                                    2. All calls' duration
                                    3. Received calls' duration
                                    4. Dialled calls' duration
                                    5. Clear timers""");
                            int callDuration = input.nextInt();
                            if (callDuration > 5) {
                                System.out.println("invalid input, kindly enter the right option");
                            } else {
                                System.out.println("We are still working on this option, kindly enter 0 to go back");
                            }
                        break;




                        case 6:
                            System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters""");
                            int callCost = input.nextInt();
                            while(callCost != 0){
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
                                 showCallDuration = input.nextInt();

                                if (showCallDuration < 5 || showCallDuration > 7){
                                    System.out.println("""
                                Sorry Lover, We are still working on this option
                                
                                kindly press 0 to the previous menu""");
                                    showCallDuration = input.nextInt();


                                }
                                if (callCost > 3){
                                    System.out.println("invalid input, kindly enter the right option");
                                     int cost = input.nextInt();
                                }
                                System.out.println("Sorry, we are still working on this app, press 0 to go back");
                                int scost = input.nextInt();
                                while(scost == 0){
                                    System.out.println("You will soon rate my app");
                                    break;
                                }
                            }break;
                        case 7:
                            System.out.println("""
                                1. Call cost limit
                                2. Show costs in""");
                    }break;
                }}














            }}

    }
}