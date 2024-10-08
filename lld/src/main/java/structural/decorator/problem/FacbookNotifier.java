package structural.decorator.problem;

public class FacbookNotifier extends Notifier{
    public FacbookNotifier(String username) {
        super(username);
    }

    @Override
    public void send(String msg) {
        String fb = databaseService.getFbNameFromUsername(getUsername());
        System.out.println("Sending "+ msg + "by Facebook to "+ fb);
    }
}
