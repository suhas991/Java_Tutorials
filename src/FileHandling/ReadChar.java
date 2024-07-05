package FileHandling;
import java.io.File;
import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        try{
            File file = new File("Hello.txt");
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            System.out.println(line);

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
