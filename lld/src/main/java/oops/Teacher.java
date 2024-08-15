package oops;

public class Teacher {

     private int id;
     String name;

//    public Teacher addTeacher(TeacherRequest te){
//
//    }

    public int getId() {
        return id +1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
