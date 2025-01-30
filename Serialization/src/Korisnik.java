import java.io.Serializable;

public class Korisnik implements Serializable {

    private static final long serialversionUID = 1567471403L;

    // class attributes
     String name;
     String lastName;
     int age;
     String country;

     // Konstruktor
    public Korisnik(String name, String lastName, int age, String country) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Korisnik{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
