package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteStream {
    public static void main(String[] args) {

        try{
            FileInputStream in = new FileInputStream("hello.txt");

            int ch;
            while((ch=in.read())!=-1){
                System.out.print((char)ch);
            }

        }catch(IOException ex){
            throw new RuntimeException(ex);
        }


    }
}
