package FileHandling;

import java.io.FileWriter;

public class WriteChar {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("hello.txt",true);
            writer.append("Hello world");
            writer.append("Welcome to india");
            writer.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
