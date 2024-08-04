import java.util.Scanner;
public class ATM {
    double balance=1000;
    public double withdraw(int amount){
        if(balance-amount>=0){
            balance = balance-amount;
            System.out.println("You withdraw the amount "+amount+" Successfully");
            System.out.print("Your account balance ");
        }
        else{
            System.out.println("sorry You don't hava sufficient balance: ");
        }
        return balance;
    } 
    public double deposit(int amount){
        balance = balance+amount;
        System.out.println("The amount "+amount+" deposited Successfully");
        System.out.print("Your account balance :");
        return balance;
    }
    public double balance(){
        System.out.println("Your account balance is :");
        return balance;
    }
}
class Backaccount{
    public static void main(String[] args) {
        ATM atm=new ATM();
        Scanner sc=new Scanner(System.in);
        int amount =sc.nextInt();
        char ch=sc.next().charAt(0);
        if(ch=='w' || ch=='W'){
            System.out.println(atm.withdraw(amount));
        }
        else if(ch=='d' || ch=='D'){
            System.out.println(atm.deposit(amount));
        }
        else if(ch=='b' || ch=='B'){
            System.out.println(atm.balance());
        }
    }
}
