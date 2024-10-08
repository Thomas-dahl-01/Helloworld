import jdk.jshell.execution.Util;

import java.util.Scanner;

public class gætteren {
    public static void main(String[] args) {

                String svar = " ";
                String svarTo = " ";
                int guessBig = 100;
                int guessSmall = 0;
                int guess = guessSmall + (guessBig - guessSmall) / 2;
                int guessCounter = 0;
                Scanner tastatur = new Scanner(System.in);
                while (!svar.substring(0,1).equalsIgnoreCase("j"))
                {
                    System.out.println("Tænk på et tal mellem "+guessSmall+" og "+guessBig+". Har du tænkt på et tal?");
                    svar = tastatur.nextLine();
                }

                while (!svarTo.substring(0,1).equalsIgnoreCase("j")) {
                    guessCounter++;
                    if (guessCounter == 9) System.out.println("Du snyder sgu gamle dreng");
                /*
                Neglected by +1 and -1
                if (guessSmall == 99) guess = 100;
                if (guessBig == 1) guess = 0; */
                    System.out.println("Er dit tal " + guess + ", større eller lavere?");
                    svarTo = tastatur.nextLine();

                    String svarSwitch = svarTo.substring(0,1).toLowerCase();
                    switch (svarSwitch) {
                        case "j":
                            System.out.println("Slap af jeg er god \nOg jeg brugte kun " + guessCounter + " forsøg!");
                            break;
                        case "s":
                            guessSmall = guess+1;
                            guess = guessSmall + (guessBig - guessSmall) / 2;
                            break;
                        case "l":
                            guessBig = guess-1;
                            guess = guessSmall + (guessBig - guessSmall) / 2;
                            break;
                    }
                }
    }
}
