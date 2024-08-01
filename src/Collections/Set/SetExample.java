package Collections.Set;

import Collections.Trainee;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

       Set<Integer> list = new HashSet<>();
//        Set<Integer> list1 = new TreeSet<>();
//        Set<Integer> list2 = new LinkedHashSet<>();

        list.add(10);
        list.add(20);
        list.add(35);
        list.add(55);

        list.add(20);
        list.add(35);

        for(int num:list){
            System.out.println(num);
        }

        Set<Trainee> trainees = new HashSet<>();

        Trainee t1 = new Trainee(1,"Rose","Kerala");
        Trainee t2 = new Trainee(2, "Gaurav","Bangalore");
        Trainee t3 = new Trainee(3,"Sandra","Kerala");
        Trainee t4 = new Trainee(2, "Gaurav","Bangalore");

        trainees.add(t1);
        trainees.add(t2);
        trainees.add(t3);
        trainees.add(t4);

        for (Trainee t:trainees){
            System.out.println(t);
        }

    }
}
