package creationalpatterns.singleton;

public class Singleton1 {

    private static Singleton1 s1;

    private Singleton1(){}

    public Singleton1 getInstance(){
        if(s1 == null)
            s1 = new Singleton1();
        return s1;
    }
}
