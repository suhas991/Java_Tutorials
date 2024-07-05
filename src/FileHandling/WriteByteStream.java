package FileHandling;

import java.io.FileOutputStream;

public class WriteByteStream {
    public static void main(String[] args) {
        try{
            FileOutputStream out = new FileOutputStream("Hello.txt");
            out.write("Hello world I am here".getBytes());
            out.close();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
