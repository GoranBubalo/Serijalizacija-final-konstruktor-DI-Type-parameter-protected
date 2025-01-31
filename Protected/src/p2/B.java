package p2;

import p1.*;

public class B extends A{

    private int graduationYear = 2026;


    public static void main(String[] args) {



        B myObj  = new B();
        myObj .display();

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}
