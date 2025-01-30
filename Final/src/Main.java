public class Main  {


    public static void main(String[] args) {

        // defining a constant variable - initialized
        final int CROATIA_NUMBER = 385;

        // Blank final variable
        final int FRANCE_NUMBER;
        FRANCE_NUMBER = 33;

        //CROATIA_NUMBER = 999;
        System.out.println("Croatian number is " + CROATIA_NUMBER);
        System.out.println("France number is " + FRANCE_NUMBER);

        // Creating a reference final variable
        final StringBuilder stringBuilder = new StringBuilder("Croatian");

        System.out.println(stringBuilder);


        stringBuilder.append(" Warrior");
        System.out.println(stringBuilder);

//        stringBuilder.append(" XXX");
//        System.out.println(stringBuilder);

        Factory factory = new Factory("ChokolateFactory", "Large","Zagreb");
        System.out.println(factory);





    }
}