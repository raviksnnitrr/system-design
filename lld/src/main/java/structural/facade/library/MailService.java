package structural.facade.library;

public class MailService {
    public void sendConfirmationMail(User user) {
        System.out.println("Sending mail to " + user.getName());
    }
}
