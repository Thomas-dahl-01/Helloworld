import javax.swing.*;
import java.util.Random;

public class diceman2 {
    public static void main(String[] args) {

        Random gen = new Random();
        int tal = gen.nextInt(6) + 1;
        String aktivitet = "";

        switch (tal) {
            case 1:
                aktivitet = "DU fucking grim";
                break;
            case 2:
                aktivitet="Din far er homo";
                break;
            case 3:
                aktivitet="Jeg smasker dig på lørdag";
                break;
            case 4:
                aktivitet="svans";
                break;
            case 5:
                aktivitet="torben helt varm";
                break;
            case 6:
                aktivitet="chelsea er mot";
        }
                JOptionPane.showMessageDialog(null, aktivitet);

    }
}
