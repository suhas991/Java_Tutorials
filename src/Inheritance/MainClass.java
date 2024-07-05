package Inheritance;

public class MainClass {
    public static void main(String[] args) {

        SingleLevel sl = new SingleLevel("Hello",1);
        sl.property();
        DoubleLevel dl = new DoubleLevel("India",3);
        dl.property();
    }
}
