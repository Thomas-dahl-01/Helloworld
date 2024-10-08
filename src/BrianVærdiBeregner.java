public class BrianVærdiBeregner {
    public static void main(String[] args) {

        System.out.println();

    }

    public class bil {

        double weight;
        double height;
        int doors;
        double hp;
        double brianværdi;

        bil(double vægt, double højde, int døre, double heste) {
            weight = vægt;
            height = højde;
            doors = døre;
            hp = heste;
            brianværdi=height*hp;


        }

        public void Briancalculator(double brianamount) {
            brianamount = height * hp;
        }

        }
    public String toString(){
        return "Din brianværdi er : ";
        }
}
