import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class StudentList2 {
    public static void main(String[] arg) throws IOException {
        FileReader fil = new FileReader("src//StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);
        ArrayList<Student> list = new ArrayList<>();

        String linje = ind.readLine();
        while (linje != null) {
            String[] bidder = linje.split(",");     // opdel i bidder efter ,
            Student s = new Student();
            s.name = bidder[1];
            s.surname = bidder[2];
            s.sno = bidder [0].substring(0,8);
            list.add(s);
            //System.out.println(navn);
            linje = ind.readLine();
        }
      list.sort(null);
        //System.out.println(list);
        for (Student e : list) {
            System.out.println(e);
        }
        save(list);
    }

    static void save(ArrayList<Student> l) throws IOException {
        FileWriter fil = new FileWriter("src//StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (Student s : l) {
            ud.println(s);
        }
        ud.close();
    }
}

class Student implements Comparable<Student> {
    String name;
    String surname;
    String sno;

    public String toString(){
        return sno+": "+name+" "+surname;
    }

    @Override
    public int compareTo(Student o) {
        return sno.compareTo(o.sno);
    }
}
