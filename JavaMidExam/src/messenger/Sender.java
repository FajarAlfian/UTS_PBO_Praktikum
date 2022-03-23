package messenger;

/**
 *
 * @author fajar
 */
public class Sender {
    public static void main(String[] args) {
        var std = new stdMessenger(); 
        var Mail = new MailMessenger();
        
//        StdMessenger Test
        System.out.println("---> Test_Std_Messenger_Started <---");
        System.out.println("Sending a Messege");
        std.sendMessege("Faan", "Pesan Singkat", "Faan Sedang Apa?");
        System.out.println("---> Test_Std_Messenger_Finished <---\n");
        
        
//        Mail Messenger Test
        System.out.println("---> Test_Mail_Messenger_Started <---");
        System.out.println("Sending a Messege"); // Not Connected Yet.
        Mail.sendMessege("Fajar", "Pesan Singkat", "Jar, Keur Naon?");
        
        Mail.disconnect(); //Disconnecting
        
        System.out.println("Connecting"); // Connecting
        Mail.connect(); //Connected
        
//        Resend
        System.out.println("Resend a Messege");
        Mail.sendMessege("Fajar", "Pesan Singkat", "Jar, Keur Naon?");
        System.out.println("---> Test_Mail_Messenger_Finished <---");
    }
}