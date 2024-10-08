import java.util.Random;

public class diceman {
    public static void main(String[] args) {
        Random gen = new Random();
        int tal = gen.nextInt(6)+1;
        String aktivitet=" ";

            if (tal ==1){
    aktivitet="morgenmad";
} else {
                if (tal == 2) {
                    aktivitet = "læs lektier";
                } else if (tal == 3) {
                    aktivitet = "svøm en tur";
                } else if (tal == 4) {
                    aktivitet = "tag ud og fisk";
                } else if (tal == 5) {
                    aktivitet = "gå i seng";
                } else if (tal == 6) {
                    aktivitet = "ring til mor";
                }
            }
        System.out.println(tal);
                System.out.println(aktivitet);






    }
}

