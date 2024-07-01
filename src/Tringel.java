import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Tringel
{
    public static void main(String[] args) {

        double a =2;
        double b = 4;
        double c = 3;

        double heron = 0.25*Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c));

        System.out.println(heron);

        try {
            var lines = Files.readAllLines(Path.of("text_file.txt"));
        } catch (IOException e) {
            System.out.println("Die Datei wurde nicht gefunden : "+ e.getMessage());
        }

    }
}
