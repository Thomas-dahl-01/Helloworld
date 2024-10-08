import java.io.*;
import java.util.ArrayList;



public class Marathon1 {
    public static void main(String[] args) throws FileNotFoundException {



        marathon("Peter Adams",1556,"D");
        marathon("Omar Farooq",1699,"D");
        marathon("Lotte Nybo",843, "B");


    }

    static void marathon (String navn,int number, String gruppe){

        System.out.println("Dear "+navn);
        System.out.println("We are happy to receive your registration");
        System.out.println("Your start number is : "+number);
        System.out.println("You will start in group: "+gruppe);
        System.out.println("Please check in 10 minutes before start");
        System.out.println("");

    }


    }

