package Multi_Threading.Example2;

public class DownloaderWithLamda {

    static void download(){
        for (int i=0; i<=100; i+=5){

            synchronized (DownloaderWithLamda.class){
                System.out.print("From " + Thread.currentThread().getName());
                System.out.print(" : Downloaded " + i + "%");
                System.out.println(" of the file");
            }
            }

        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex){
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(()->download());
        Thread t2 = new Thread(()->download());

        t1.setName("Downloader 1");
        t2.setName("Downloader 2");

        t1.start();
        t2.start();
    }

}
