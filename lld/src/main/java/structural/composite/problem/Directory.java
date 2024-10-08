package structural.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String directoryName;
    private List<Object> objectList;

    public Directory(String name){
        this.directoryName = name;
        objectList = new ArrayList<>();
    }
    public void add(Object o) {
        this.objectList.add(o);
    }

    /**
     * Problem with this design is if we have multiple type of objects in the list then we
     * have to write that many if conditions to handle each, which is violating open-closed principle
     */
    public void ls(){
        System.out.println("Directory Name: "+ directoryName);
        for(Object o : objectList){
            if( o instanceof File){
                ((File) o).ls();
            }else if(o instanceof Directory){
                ((Directory) o).ls();
            }
        }
    }
}
