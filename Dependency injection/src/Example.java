public class Example {
    private DatabaseThings myDatabase;

    //Dependency Non-Injection
//    public Example(){
//        this.myDatabase = new DatabaseThings();
//    }

    // Dependency Injection
    public Example(DatabaseThings databaseThings){
        this.myDatabase = databaseThings;
    }

    public void doStuff(){
        myDatabase.getData();
    }
}
