package Multi_Threading.Example2;

public class DownloaderWithThread {
    public static void main(String[] args) {
       Thread d1 = new Downloader();
       Thread d2 = new Downloader();

       d1.setName("Downloader 1");
       d2.setName("Downloader 2");

       d1.start();
       d2.start();
    }
}
class Downloader extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("From"+getName()+" downloaded "+i+"%");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
