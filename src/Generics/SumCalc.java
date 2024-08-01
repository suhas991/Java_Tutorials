package Generics;

import java.util.List;

public class SumCalc {

    public static double sum(List<? extends Number> numbers){

        double sum =0;
        for(Number n:numbers){
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum(l1));

        List<Double> l2 = List.of(1.0,2.25,3.25,23.5,45.12,5.13);
        System.out.println(sum(l2));

    }
}
