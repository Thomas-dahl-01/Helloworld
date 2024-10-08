import java.util.Scanner;

public class guess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int guess = min +(max-min) / 2;

        System.out.println("think of a number between " + min + " and " + max);
        System.out.println("Tænk på et nummer");
        int correct = scanner.nextInt();
        System.out.println(guess);

        int i = 0;
        while (guess != correct) {
            if (guess > correct) {
                max = guess;
            } else {
                min = guess;
            }

            i++;
            guess = min + (max - min) / 2;
            System.out.println("Er dit tal " + guess);
            scanner.nextInt();
            String svar;
            switch (svar = scanner.nextLine()) {

                case "j":
                    guess = correct;
                    System.out.println("Dit tal er " + guess);
                    break;
                case "s":
                    min = guess + 1;
                    guess = min + (max - min) / 2;
                    break;
                case "l":
                    max = guess - 1;
                    guess = min + (max - min) / 2;


            }
            System.out.println("Det tog mig kun " + i + " forsøg");
        }
    }
}