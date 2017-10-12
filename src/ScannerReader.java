import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) {
        String fileName = "Testowy.txt";
        File file = new File(fileName);
        try (Scanner scan = new Scanner(file)) {
            while(scan.hasNextLine()){
                String name = scan.nextLine();
                System.out.println(name);
            }
        } catch (FileNotFoundException exc){
            System.out.println("Nie ma takiego pliku");
        }
    }
}
