package InterfaceUsecase;

import java.sql.SQLOutput;

public class Person{


    public static void main(String[] args) {

        String pali="abcbc";

        StringBuilder word = new StringBuilder(pali);
        System.out.println(word);

        StringBuilder rev= new StringBuilder(word).reverse();
        System.out.println(rev);

        System.out.println(word.toString().contentEquals(rev));


    }
}
