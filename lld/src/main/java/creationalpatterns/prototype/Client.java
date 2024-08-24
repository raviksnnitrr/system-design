package creationalpatterns.prototype;

public class Client {

    public static void main(String [] args){
        Student st = new Student(1, "Ravi", 123);
        Student stcopy = (Student) st.clone();
    }
}
