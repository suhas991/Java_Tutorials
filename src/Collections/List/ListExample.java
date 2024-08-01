package Collections.List;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list1 = new LinkedList<>();
//        List<String> list2 = new ArrayList<>();
//        List<String> list3 = new Vector<>();
//        List<Double> list4 = new Stack<>();

        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(10);

        list1.remove(0);
        System.out.println(list1.get(2));

        System.out.println(list1);


    }
}
