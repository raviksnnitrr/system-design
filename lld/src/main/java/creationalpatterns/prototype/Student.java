package creationalpatterns.prototype;

public class Student implements Prototype{

    int id;
    String name;
    private int rollNo;

    public Student(int id, String name, int rollNo){
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public Prototype clone() {
        return new Student(id,name,rollNo);
    }
}
