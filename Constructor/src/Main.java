public class Main {
    public static void main(String[] args) {

        Osoba osoba1= new Osoba("Tonko","Tonkić",50);

        Osoba osoba2 = new Osoba(osoba1);

        // reference to object location in memory
        Osoba osoba3 = osoba2;

        System.out.println(osoba1);

        System.out.println(osoba2);


        System.out.println(osoba3);

    }
}