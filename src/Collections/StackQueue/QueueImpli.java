package Collections.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpli {
    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();

        que.add("Vishnu");
        que.offer("Suhas");
        que.add("Akshay");
        que.add("Yash");

        System.out.println(que);

        que.poll();

        while(!que.isEmpty()){
            System.out.println("Proccesed : " + que.poll());
        }


    }
}
