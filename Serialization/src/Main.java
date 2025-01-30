import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("korisnik.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject("User One");
        oos.writeObject( new Korisnik("Ivan", "Ivic", 35,"Croatia"));
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