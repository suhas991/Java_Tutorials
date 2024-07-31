package FileHandling;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        try{
            FileReader fs = new FileReader("hello.txt");

            int ch;
            while((ch=fs.read())!=-1){
                System.out.print((char)ch);
            }

            System.out.println();

            File f = new File("hello.txt");
            Scanner sc = new Scanner(f);
            String line = sc.nextLine();
            System.out.println(line);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
