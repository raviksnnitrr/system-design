package structural.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private String directoryName;
    private List<FileSystem> objectList;

    public Directory(String name){
        this.directoryName = name;
        objectList = new ArrayList<>();
    }
    public void add(FileSystem o) {
        this.objectList.add(o);
    }
    @Override
    public void ls() {
        System.out.println("Directory Name: "+ directoryName);
        for(FileSystem fs : objectList){
            fs.ls();
        }
    }
}
