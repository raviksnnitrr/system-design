package creationalpatterns.abstractfactorypattern;

public interface Shape {

    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}