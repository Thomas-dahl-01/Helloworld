import java.awt.print.Printable;

public class Main {
    public static void main(String[] args) {

        int alder;
        alder = 12;
        if (alder >= 18) System.out.println("du er myndig");
        else if (alder >=15) System.out.println("Du er ikke myndig");
        else if (alder >=12) System.out.println("Tag hjem og sov du er slet ikke gammel nok");
        else if (alder >=5) System.out.println("spis en slikkepind og gå i seng");
        System.out.println("du er " +alder+ " år.");

        System.out.println("NY OPGAVE");

        double euro;
        double dollar;
        dollar=0.1;
        double pengedollar;
                pengedollar=1.104;
                euro=pengedollar*dollar;
                double penge2;
                penge2=euro*0.98;

        if (penge2 >= 0.5) System.out.println("beløbet er "+penge2+"€ efter vores kommision på 2%");
        else if (penge2<=0.5) System.out.println("beløbet er ikke stort nok til vi kan veksle desværre");{


System.out.println("NY OPGAVE");
            java.util.Scanner tastatur = new java.util.Scanner(System.in);

            int vægt; int pris;
            vægt = tastatur.nextInt();
            pris = tastatur.nextInt();
            if (vægt<=50)System.out.println("koster  det");


        }
    }
}
