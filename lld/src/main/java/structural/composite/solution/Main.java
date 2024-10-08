package structural.composite.solution;

public class Main {

    public static void main(String[] args){
        Directory directory = new Directory("Movie");
        FileSystem movie1 = new File("f1");
        directory.add(movie1);
        Directory d2 = new Directory("Comedy Movie");
        File movie2 = new File("f2");
        d2.add(movie2);
        directory.add(d2);
        directory.ls();
    }
}
