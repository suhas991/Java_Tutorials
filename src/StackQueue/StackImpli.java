package StackQueue;

import java.util.*;

public class StackImpli {
    public static void main(String[] args) {

        Stack<String> st =new Stack<>();
        st.push("Welcome");
        st.push("GoodBye");
        st.push("Held");
        st.push("GO AWAY");

        System.out.println(st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        System.out.println(st);



    }
}
