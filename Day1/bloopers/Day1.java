package bloopers;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day1 {

    String newline = System.getProperty("line.separator");  

    public static void main(String[] args) throws IOException {

        Path myPath = Paths.get("C:\\Users\\SIRO\\Desktop\\All files\\Hobbies\\Programming\\AdventOfCode\\Elves.txt");

        List < String > lines = Files.readAllLines(myPath, StandardCharsets.UTF_8);


        // for (int = 0; i < List.size())

        lines.forEach(newline -> System.out.println());
        // lines.forEach(line.toInt -> ArrayList.add(linetoInt));

    }

    

}