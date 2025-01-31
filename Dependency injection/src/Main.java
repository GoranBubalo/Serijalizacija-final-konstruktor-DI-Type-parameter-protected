public class Main {

    public static void main(String[] args) {
        DatabaseThings databaseThings = new DatabaseThings();

        Example example = new Example(databaseThings);
        example.doStuff();

    }
}