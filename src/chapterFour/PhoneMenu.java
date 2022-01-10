package chapterFour;
import javax.security.auth.callback.LanguageCallback;
import java.security.SecureRandom;
import java.util.Scanner;
public class PhoneMenu {
    public static void main(String[] args) {
        String prompt = """
                For PhoneBook press 1
                For Messages press 2
                For Chat press 3
                For  Call register press 4
                For Tones press 5
                For Settings press 6
                For Call divert press 7
                For Games press 8
                For Calculator press 9
                For Reminders press 10
                For Clock press 11
                For Profiles press 12
                For SIM services press 13
                """;
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int press = scanner.nextInt();
        switch (press) {
            case 1:
                System.out.println("1. Search");
                System.out.println("2. Service Nos");
                System.out.println("3. Add name");
                System.out.println("4. Erase");
                System.out.println("5. Edit");
                System.out.println("6. Assign tone");
                System.out.println("7. Send b' card");
                System.out.println("8. Options");
                System.out.println("Select options");
            {
                int options = scanner.nextInt();
                switch (options) {
                    case 1:
                        String option = """
                                Type of view
                                Status Memory
                                """;
                        System.out.println(options);
                        int view = scanner.nextInt();
                                switch (view){
                                    case 12:
                                        System.out.println("Type of view");
                                        System.out.println("Status Memory");
                                }

                }
            }
            System.out.println("9. Speed dials");
            System.out.println("10. Voice tags");
            break;
            case 2:
                System.out.println("1. Write messages");
                System.out.println("2. Inbox");
                System.out.println("3. Outbox");
                System.out.println("4. Picture messages");
                System.out.println("5. Templates");
                System.out.println("6. Smileys");
                System.out.println("7. Message settings");
                System.out.println("select Message settings");
        }
        int Messagesettings = scanner.nextInt();
        switch (Messagesettings) {
            case 14:
                String message = """
                            Set 1
                        """;
        }
                int Set1 = scanner.nextInt();
                switch (Set1) {
                    case 15:
                        String set = """
                                Message centre number
                                Mesaage sent as
                                Message validity
                                """;
                }
                        int Common3 = scanner.nextInt();
                        switch (Common3){
                            case 16:
                                String common3 = """
                                        Delivery reports
                                        Reply via same centre
                                        Character support
                                     """;
                                System.out.println(common3);
                System.out.println("8. Info service");
                System.out.println("9. Voice mailbox number");
                System.out.println("10. Service command editor");
                break;


            case 3:
                System.out.println("1. Missed calls");
                System.out.println("2. Received calls");
                System.out.println("3. Dialed numbers");
                System.out.println("4. Erase recent call lists");
                System.out.println("5. Show call duration");
                System.out.println("select show call duration");
        }
        int Callduration =scanner.nextInt();
        switch (Callduration) {
            case 18:
                String duration = """
                        Last call duration
                        All calls' duration
                        Received calls'duration
                        Dialed calls"duration
                        Clear timers
                        """;
                System.out.println(duration);

                System.out.println("6. Show call costs");
                System.out.println("select show call costs");
                break;
        }
        int Callcosts = scanner.nextInt();
                switch (Callcosts) {
                    case 19:
                        String cost = """
                                                                
                                Last call costs
                                All calls'cost
                                Clear counters
                                """;
                        System.out.println(cost);
                        System.out.println("7. Call cost settings");
                        System.out.println("a. Call cost limit, b.Show costs in");
                        System.out.println("8. Prepaid credit");
                        break;
                    case 5:
                        System.out.println("1. Ringing tone");
                        System.out.println("2. Ringing volume");
                        System.out.println("3.Incoming call alert");
                        System.out.println("4. Composer");
                        System.out.println("5.Message alert tone");
                        System.out.println("6. Keypad tones");
                        System.out.println("7. Warning and game tones");
                        System.out.println("8. Vibrating alert");
                        System.out.println("9. Screen saver");
                        break;
                    case 6:
                        System.out.println("1.Call settings");
                        System.out.println("select Call settings");
                        break;
                }
                 int Callsettings= scanner.nextInt();
                switch (Callsettings) {
                    case 20:
                        String settings = """
                                Automatic redial
                                Speed dialing
                                Call waiting options
                                Own number sending
                                Phone line in use
                                Automatic answer
                                """;
                        System.out.println(settings);
                        System.out.println("2.Phone Settings");
                        System.out.println("select Phone Settings");
                        break;
                }
                int PhoneSettings = scanner.nextInt();
                switch (PhoneSettings){
                    case 21:
                        String phone = """
                                Language
                                Cell info display
                                Welcome note
                                Network selection
                                Lights
                                Confirm SIM service action
                                """;
                        System.out.println(phone);
                        System.out.println("3.Security settings");




        }
    }
}
