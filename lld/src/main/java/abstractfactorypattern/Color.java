package abstractfactorypattern;

public interface Color {

    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red");
    }
}
class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Green");
    }
}
