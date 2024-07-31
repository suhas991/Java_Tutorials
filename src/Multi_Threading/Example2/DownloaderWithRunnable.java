package Multi_Threading.Example2;

public class DownloaderWithRunnable {
    public static void main(String[] args) {

        Runnable r1 = new MyDownloader();
        Runnable r2 = new MyDownloader();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.setName("Downloader_1");
        t2.setName("Downloader_2");

        t1.start();
        t2.start();
    }
}

class MyDownloader implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<=100; i+=5){
            System.out.println("From "+Thread.currentThread().getName()+" downloaded "+i+"%");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}

