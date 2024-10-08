import java.util.Random;

public class platEllerKrone {
    public static void main(String[] arg) {

      int alder;
      alder = 17;
      while (alder<18)
      {
          System.out.println("du er "+alder+" år. vent til du bliver ældre");
          alder = alder + 1;
          System.out.println("Tillykke med fødselsdagen");
      }
        System.out.println("nu er du "+alder+" år");



      int n;
      n=1;

      while (n<=10)
      {
          System.out.println(n+" : "+7*n);
          n=n+1;

      }
for (int s=1; s<=10; s=s+1)
{
    int sum =0;
    for (int j=0; j<s; j++) {
        sum = sum + 7;
        System.out.println(sum + "..");
    }
    System.out.println("syv gange "+s+" giver: "+sum);

    }

}


        }



