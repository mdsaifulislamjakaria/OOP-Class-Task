// problem 4(d);
import java.util.*;

class Wallet{
    private int balance=0;
    void deposite(int amount){
        if(amount<=0) System.out.println("Invalid Amount");
        else{
            this.balance+=amount;
            System.out.println("Deposite : " +amount);
            System.out.println("New Balance : " +balance);
        }
    }

    void withdraw(int amount){
        if(amount>balance || amount<=0) System.out.println("Invalid Amount");
        else{
            this.balance-=amount;
            System.out.println("Withdraw : " +amount);
            System.out.println("New Balance : " +balance);
        }
    }
}

public class problem43 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            Wallet W=new Wallet();

            for(int i=0;i<n;i++){
                sc.nextLine();
                String s=sc.nextLine();
                int amount=sc.nextInt();

                if(s.equals("deposite")) W.deposite(amount);
                else W.withdraw(amount);
            }
        }
    }
}


/*

        Input :

        6
        deposite
        -1
        deposite
        -5
        deposite
        20
        withdraw
        50
        deposite
        50
        withdraw
        60

        Output :   

        Invalid Amount
        Invalid Amount
        Deposite : 20
        New Balance : 20
        Invalid Amount
        Deposite : 50
        New Balance : 70
        Withdraw : 60
        New Balance : 10


*/