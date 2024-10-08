package structural.decorator.solution;

public class WhatsappDecorator extends BaseNotifierDecorator{
    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String phoneNbr = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending " + msg + " by WhatsApp on " + phoneNbr);
    }
}
