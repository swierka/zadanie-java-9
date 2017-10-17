import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        int i;
        int j;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        i = scan.nextInt();
        double[] Numbers = new double[i];

        boolean x = false;

        for (j = 0; j < Numbers.length; j++) {
            do {
                try {
                    System.out.println("Podaj liczbe nr " + (j + 1));
                    Numbers[j] = scan.nextDouble();
                    x = true;
                } catch (InputMismatchException | NullPointerException exc) {
                    System.out.println("Podaj liczbe zmiennoprzecinkowa");
                } finally {
                    scan.nextLine();
                }
            } while (x == false);
        }


        try (
                FileWriter fileWriter = new FileWriter("MojeLiczby.txt");
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {
            for (j = 0; j < Numbers.length; j++) {
                String numberAsString = Double.toString(Numbers[j]);
                writer.write(numberAsString);
                writer.newLine();
            }
        } catch (IOException exc) {
            System.out.println("Nie mozna zapisac pliku");
        }
    }

/*        try (
                FileWriter fileWriter = new FileWriter("MojeLiczby.txt");
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ) {

            for (double number : Numbers) {
                String stringAsString = Double.toString(number);
                writer.write(stringAsString);
                writer.newLine();
            }
        } catch (IOException exc) {
            System.out.println("Nie mozna zapisac pliku");
        }*/
}
