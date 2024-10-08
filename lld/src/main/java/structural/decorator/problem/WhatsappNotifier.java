package structural.decorator.problem;

public class WhatsappNotifier extends Notifier{
    public WhatsappNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String msg) {
        String phoneNumber = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending "+ msg + "by Whatsapp to "+ phoneNumber);
    }

}
