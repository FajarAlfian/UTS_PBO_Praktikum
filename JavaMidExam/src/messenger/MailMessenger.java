package messenger;

/**
 *
 * @author fajar
 */
public class MailMessenger implements Messenger{
    private boolean isSuccess,  isConnectedToServer;
    
    void connect(){
        isConnectedToServer = true;
        System.out.println("Connected to Server\n");
    }
    
    void disconnect(){
        isConnectedToServer = false;
        System.out.println("Disconnected from Server\n");
    }
   
    @Override
    public void sendMessege(String receiver, String subject, String messege) {
        System.out.println("Receiver        : "+receiver);
        System.out.println("Subject         : "+subject);
        System.out.println("Message         : "+messege);
        
        if (receiver == "") {
            isSuccess = false;
            System.out.println("Status Message  : "+isSuccess);
            System.out.println("Pesan gagal Terkirim.\n");
        } else {
            isSuccess = true;
            System.out.println("Status Message  : "+isSuccess);
            System.out.println("Pesan Berhasil Terkirim.\n");
        }
    }
}
