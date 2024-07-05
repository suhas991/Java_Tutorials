package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UpdatedMethod {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("hello.txt");
        Files.lines(path).forEach(line-> System.out.println(line));
    }
}
