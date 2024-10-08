import java.util.ArrayList;

public class FigurApp {
    public static void main(String[] args) {
        ArrayList<figur> list = new ArrayList<figur>();
        list.add(new Rektangel(3,7));
        list.add(new Punkt());
        list.add(new Cirkel(3));
        list.add(new Cirkel(7));
        list.add(new Linje(5));

        for (figur f:list){
            System.out.println(f);
            System.out.println("\t areal="+f.beregnareal());
        }

    }
}

abstract class figur {
    abstract double beregnareal();
    abstract double beregnomkreds();
}

class Punkt extends figur{
    double beregnareal(){
         return 0;
    }
    double beregnomkreds(){
         return 0;
     }
}

class Linje extends figur {
    double laengde;
    Linje (double l){
        l=laengde;
    }
    double beregnareal(){
        return 0;
    }
    double beregnomkreds(){
        return 2*laengde;
    }

}

class Cirkel extends figur {
    double radius;

    Cirkel(double r){
        radius=r;
    }
    double beregnareal(){
        return Math.PI*radius*radius;
    }
    double beregnomkreds(){
        return 2*Math.PI*radius;

    }
public String toString(){
    return "Cirkel r="+radius;
    }
}

class Rektangel extends figur {
    double hoejde;
    double bredde;

    Rektangel(double h, double b){
        hoejde=h;
        bredde=b;
    }
    double beregnareal(){
        return hoejde*bredde;
    }
    double beregnomkreds(){
        return 2*(hoejde+bredde);
    }
    public String toString(){
        return "Rektangel("+hoejde+","+bredde+")";
    }

}