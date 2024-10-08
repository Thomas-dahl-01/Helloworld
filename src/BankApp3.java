import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class BankApp3 {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<>();

        Indlaan a1=new Indlaan("Jill", 3);
        a1.deposit(100);
        a1.withdraw(50);
        System.out.println();

        Hojrente a2=new Hojrente("bob", 10, 100000, LocalDate.of(2023, 12, 24));
        a2.deposit(20);
        a2.withdraw(100000);
        System.out.println();

        kredit a3=new kredit("janus",10);
        a3.deposit(250);
        a3.withdraw(2000);

        borneopsparing a4= new borneopsparing("hans",200,LocalDate.of(2042, 9,24));
        a4.deposit(3000);
        a4.withdraw(500);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        for (Account a:list){
            a.annualInterest();
           // a.deposit(100);
            a.printTransactions();
            System.out.println();
        }
    }
}
class Indlaan extends Account {
    Indlaan(String ow, double rate){
        super(ow, rate);
    }
    public void withdraw(double amount){
        if (amount>balance) {
            System.out.println("Der er ikke penge nok på kontoen");
        }
        else{
            super.withdraw(amount);
        }
    }
}
    class Hojrente extends Account{
    LocalDate releaseDate;

    Hojrente(String ow, double rate, double startbalance, LocalDate date){
    super(ow, rate);
    super.deposit(startbalance);
    releaseDate=date;
}
        public void deposit(double amount){
            System.out.println("Der kan ikke indsættes penge på denne konto");
    }

        public void withdraw(double amount){
        LocalDate today=LocalDate.now();
        if (today.isBefore(releaseDate)) {
            System.out.println("Pengene er bundet indtil : " + releaseDate);
        }
            else {
                super.withdraw(amount);
            }
        }
        }

class kredit extends Account{

    kredit(String ow, double amount){
        super(ow,amount);
    }
    public void withdraw(double amount){
        double konto;
        konto =balance-amount;

        if (konto >-10000) {
            super.withdraw(amount);
        }
        else{
            System.out.println("din grænse er på -10000");
        }
    }
}
class borneopsparing extends Account {
    LocalDate attenaar;
    borneopsparing(String ow, double amount, LocalDate date) {
        super(ow, amount);
        attenaar= date;
    }
        public void withdraw(double amount){
            LocalDate today = LocalDate.now();
            if (today.isBefore(attenaar)) {
                System.out.println("pengene er bundet indtil personen fylder 18, som er : " + attenaar);
            } else {
                super.withdraw(amount);
            }
        }
    }
