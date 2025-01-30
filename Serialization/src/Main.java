import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Korisnik ivan = new Korisnik("Ivan", "Ivic", 35,"Croatia");

        // Creating an output stream to a file AND
        FileOutputStream fos = new FileOutputStream("korisnik.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject("User One");
        oos.writeObject(ivan);
        oos.close();

        FileInputStream fis = new FileInputStream("korisnik.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        String name = (String) ois.readObject();
        System.out.println("name = " + name);

        Korisnik korisnik = (Korisnik) ois.readObject();
        System.out.println("korisnik" + korisnik);
        ois.close();


    }
}