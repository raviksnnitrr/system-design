package structural.decorator.solution;

public class Main {

    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsappDecorator(new Notifier("Ravi")));
        notifyAll.send("Hi");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Dushyant"));
        notifyFbMail.send("Hello");

    }
}
