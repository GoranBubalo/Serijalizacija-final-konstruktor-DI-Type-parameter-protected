public class Osoba extends Building {
    private String name;
    private String lastName;
    private int age;

    // no-argument constructor
    public Osoba() {
    }

    // Constructor overloading
    public Osoba(String name) {
        this.name = name;
    }

    public Osoba(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    // parameterized Constructor
    public Osoba(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // copy Constructor
    Osoba(Osoba osoba){
        this(osoba.name, osoba.lastName);
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
