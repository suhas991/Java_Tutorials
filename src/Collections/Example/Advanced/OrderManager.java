package Collections.Example.Advanced;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class OrderManager {

    Queue<Order> pendingOrder;
    Stack<Order> completedOrder;

    public OrderManager() {
        pendingOrder = new PriorityQueue<>((t1,t2)->t1.getPriOrder()-t2.getPriOrder());
        completedOrder = new Stack<>();
    }

    public void addOrder(Order or){
        pendingOrder.offer(or);
        System.out.println("Order " + or.getItem() + " added by " + or.getName());
    }

    public void processOrder(){
        while(!pendingOrder.isEmpty()){

            Order lat = pendingOrder.poll();

            try{
                System.out.println("Processing order "+ lat.getItem());
                Thread.sleep(1000);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            System.out.println("Order Served");
            completedOrder.push(lat);
        }
    }

    public void showCompleted(){
        System.out.println("Completed Orders : ");
        while(!completedOrder.isEmpty()){
            Order temp = completedOrder.pop();
            System.out.println(temp.getName());
        }
    }

    public static void main(String[] args) {

        OrderManager orderPlaced = new OrderManager();

        orderPlaced.addOrder(new Order("Suhas","Doosa",10));
        orderPlaced.addOrder(new Order("Ankush","Panner Rice",1));

        orderPlaced.processOrder();
        orderPlaced.showCompleted();

    }

}
