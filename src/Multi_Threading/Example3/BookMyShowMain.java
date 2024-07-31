package Multi_Threading.Example3;

import java.awt.*;

public class BookMyShowMain {

    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow(500, 500);

        Thread t1 = new Thread(
                ()-> bookMyShow.bookTicket("Akash",2));
        Thread t2 = new Thread(
                ()->bookMyShow.addMoneyToWallet(1000));


        t1.start();
        t2.start();

    }
}
