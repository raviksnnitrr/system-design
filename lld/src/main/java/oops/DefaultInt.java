package oops;

public interface DefaultInt {

    void test();


    default void test1(){
        System.out.println("test");
    }
}
