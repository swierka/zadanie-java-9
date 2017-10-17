package Zad1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException {
        //wyjatki moga byc tez umieszczone w konstruktorze!
        if (firstName.length() < 2 || firstName == null) {
            throw new NameUndefinedException();
        }
        if (lastName.length() < 2 || lastName == null) {
            throw new NameUndefinedException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        this.firstName = firstName;
        if (firstName.length() < 2 || firstName == null) {
            throw new NameUndefinedException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        this.lastName = lastName;
        if (lastName.length() < 2 || lastName == null) {
            throw new NameUndefinedException();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        this.age = age;

        if (age < 1) {
            throw new IncorrectAgeException();
        }

    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
