package creationalpatterns.builder;

public class Student {
    private int id;
    private String name;
    private String fatherName;

    public Student(StudentBuilder studentBuilder){
        this.id = studentBuilder.getId();
        this.name = studentBuilder.getName();
        this.fatherName = studentBuilder.getFatherName();
    }
}
