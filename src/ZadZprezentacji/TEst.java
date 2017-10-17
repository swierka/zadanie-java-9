package ZadZprezentacji;

import ZadZprezentacji.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TEst {
    public static void main(String[] args) {

        List<Product> tabelka = new ArrayList<>();
        Product product1 = new Product("Czekolada","Wawel",4.5);
        Product product2 = new Product("Ciastka","Jutrzenka", 4.80);
        Product product3 = new Product("Nutella","Ferrero", 12.50);
        tabelka.add(product1);
        tabelka.add(product2);
        tabelka.add(product3);


        String fileName = "Testowy.csv";

        try(
                FileWriter fileWriter = new FileWriter(fileName);
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ){
            writer.write(product1.toString());
            writer.newLine();
            writer.write(product2.toString());
            writer.newLine();
            writer.write(product3.toString());

        } catch (IOException e){
            System.out.println("Nie można utworzyć pliku");
        }
    }
}
