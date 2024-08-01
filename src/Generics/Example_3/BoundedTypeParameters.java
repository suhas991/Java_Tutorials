package Generics.Example_3;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        NumberBox<Integer> integerBox = new NumberBox<>();
        integerBox.setValue(42);
        Integer integerValue = integerBox.getValue();
        System.out.println(integerValue);
    }
}
