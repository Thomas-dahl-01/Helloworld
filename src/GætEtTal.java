import java.util.Scanner;
import java.util.Random;

public class GætEtTal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nummer = random.nextInt(100)+1;
        int guess;
        int attempts =0;
        System.out.println("velkommen til gæt et tal");
        System.out.println("jeg har valgt et tal mellem 1-100");
        System.out.println("kan du gætte det BRORMAND?");

        do {
            System.out.println("Skriv dit gæt");
            guess=scanner.nextInt();
            attempts++;

            if (guess>nummer) {
                System.out.println("Tallet er lavere! Prøv igen");
            }
            else if (guess < nummer) {
                System.out.println("Tallet er højere, prøv igen");}
            else {
                System.out.println("Gz, du gættede det på " + attempts + " forsøg");
            }
            }
            while (guess!=nummer);

            scanner.close();

        }


    }

