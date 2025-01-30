import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("korisnik.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject("Ivan");
        oos.writeObject( new Korisnik("Ivan", "Ivić", 35,"Croatia"));
        oos.close();

        FileInputStream fis = new FileInputStream("korisnik.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);


    }
}