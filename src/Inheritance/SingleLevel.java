package Inheritance;

public class SingleLevel {

    int id;
    String name;

    public SingleLevel(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void property(){
        System.out.println("Parent class property");
    }
}
