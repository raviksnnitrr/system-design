package structural.decorator.problem;

public class Notifier {
    private final String username;
    protected final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    public void send(String msg){
        String email = databaseService.getMailFromUsername(username);
        System.out.println("Sending "+ msg + "by Mail to "+email);
    }
    public String getUsername(){
        return this.username;
    }
}
