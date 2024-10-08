import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1=new Account("Joe Pass", 2.5);
        //a1.accountNo=1;
        //a1.owner="Joe Pass";
        //a1.balance=500;
        //a1.interestRate=2.5;

        Account a2=new Account("Jimmy Hendrix", 2.5);
        /*a2.accountNo=2;
        //a2.owner="Jimmy Hendrix";
        //a2.balance=1000;
        a2.interestRate=2.5; */

        a1.deposit(200);
        a1.deposit(1000);
        a1.withdraw(400);
        a1.annualInterest();
        a1.printTransactions();
        System.out.println();
        a2.printTransactions();
        System.out.println();

        //System.out.println(a1);
        //System.out.println(a2);
    }
}

class Account {
   protected int accountNo;
   protected String owner;
   protected double balance;         //indestående i kr
   protected double interestRate;    //rentesats i %
   protected ArrayList<Transaction> transactions= new ArrayList<>();
   private static int noOfAccounts=0;

    Account( String ow, double rate){
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=ow;
        balance=0;
        interestRate=rate;
    }


    public void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat",amount,balance));
    }

    public void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hævet",amount,balance));
    }
    public void annualInterest(){
        double interest=balance*interestRate/100;
        balance=balance+interest;
        transactions.add(new Transaction("Rente",interest,balance));
    }

    public void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t: transactions){
            System.out.println(t);
        }

    }

    public String toString(){
        return "Kontonr : "+accountNo+": "+owner+ " "+balance;
    }
}

class Transaction{
    String text;
    LocalDate date;
    double amount;
    double newbalance;

    Transaction(String text,double amount, double newbalance){
        this.text=text;
        date=LocalDate.now();
        this.amount=amount;
        this.newbalance=newbalance;
    }
    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newbalance;
    }
}