package ContolFlow;

public class controlFlow {
    public static void main(String[] args) {
        int age = 80;
        String citizen = "Indian";

        //if
        if (age >= 18)
            System.out.println("You can vote");

        //if-else
        if (age >= 18)
            System.out.println("You can vote");
        else
            System.out.println("Minor Alert");

        //nested if
        if (citizen.equals("Indian"))
            if (age >= 18)
                System.out.println("You can vote");

        //if else if
        if (age >= 18 && age <= 69)
            System.out.println("Vote in queue");
        else if (age >= 70) {
            System.out.println("Senior alert Direct entry to vote");

        } else {
            System.out.println("Minor alert");
        }

        //switch-case
        int num = 20;

        switch (num) {
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 15:
                System.out.println("It is 15");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");

        }


    }
}
