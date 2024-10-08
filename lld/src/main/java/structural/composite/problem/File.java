package structural.composite.problem;

public class File {
    private String name;
    public File(String name){
        this.name = name;
    }

    public void ls(){
        System.out.println("File: "+ name);
    }
}
