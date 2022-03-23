package messenger;

/**
 *
 * @author fajar
 */
public class stdMessenger implements Messenger{
    private boolean isSuccess;
   
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
