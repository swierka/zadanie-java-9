import java.util.Scanner;

public class NewPerson {
    public static void main(String[] args) {

        Person person1 = new Person();
        Scanner scan = new Scanner(System.in);
        boolean x = false;

        do {
            try {
                System.out.println("Podaj imie");
                person1.setFirstName(scan.nextLine());
                System.out.println("Podaj nazwisko");
                person1.setLastName(scan.nextLine());
                x = true;
            } catch (NameUndefinedException exp) {
                System.out.println("Wprowadz poprawne imie/nazwisko");
            }
        }
            while (x == false) ;


            do {
                try {
                    System.out.println("Podaj wiek");
                    person1.setAge(scan.nextInt());
                    x = true;
                } catch (IncorrectAgeException exp) {
                    System.out.println("Wprowadz poprawny wiek");
                } finally {
                    scan.nextLine();
                }
            }
            while (x == false);

        System.out.println("Podaj pesel");
        person1.setPesel(scan.nextLine());
        scan.close();

    }
}
