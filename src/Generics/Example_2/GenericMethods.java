package Generics.Example_2;

public class GenericMethods {

    public static void main(String[] args) {
        Utils u1 = new Utils();
        String result_S = u1.utilsProcess("Hello world");
        Integer result_I = u1.utilsProcess(124);

        System.out.println(result_I + " " + result_S);

    }
}
