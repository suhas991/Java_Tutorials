package Generics.Example_1;

public class GenericClass {

    public static void main(String[] args) {

        Box<String> b1 = new Box<>();
        b1.setContent("Hello");
        System.out.println(b1.getContent());

        Box<Integer> b2 = new Box<>();
        b2.setContent(124);
        System.out.println(b2.getContent());

    }
}
