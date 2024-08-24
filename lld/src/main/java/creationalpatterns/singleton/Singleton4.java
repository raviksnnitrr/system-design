package creationalpatterns.singleton;

public class Singleton4 {
    private static Singleton4 singleton4 = new Singleton4();

    private Singleton4(){}

    public Singleton4 getInstance(){
        return singleton4;
    }
}
