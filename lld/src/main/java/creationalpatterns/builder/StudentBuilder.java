package creationalpatterns.builder;

public class StudentBuilder {
    private int id;
    private String name;
    private String fatherName;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Student build(){
        return new Student(this);
    }
}
