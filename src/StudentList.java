import java.io.*;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] arg) throws IOException {
        FileReader fil = new FileReader("src//StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<String> list = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null) {
            String[] bidder = linje.split(",");     // opdel i bidder efter ,
            String navn = bidder[1];
            list.add(navn);
            //System.out.println(navn);
            linje = ind.readLine();
        }
        list.sort(null);
        //System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        save(list);
    }

    static void save(ArrayList<String> l) throws IOException {
        FileWriter fil = new FileWriter("src//StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s : l) {
            ud.println(s);
        }
        ud.close();
    }
}
