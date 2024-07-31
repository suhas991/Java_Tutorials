package Assignmnet;

public class StringBuilderProp {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony Stark");

        System.out.println(sb.charAt(3));

        sb.setCharAt(3,'K');
        System.out.println(sb);

        sb.insert(1,'A');
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);

        sb.append('P');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);


    }
}
