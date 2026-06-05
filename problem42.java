// problem 4(c);
import java.util.*;

public class problem42 {

    static int deposite(int balance,int val){
        if(val<=0) return balance;
        else return balance+val;
    }   

    static int withdraw(int balance,int amount){
        if(amount>balance) return balance;
        else return balance-amount;
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int balance1=0,balance2=0;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                sc.nextLine();
                String s=sc.nextLine();
                String w=sc.nextLine();
                int amount=sc.nextInt();

                if(s.equals("deposite")){
                    if(w.equals("wallet1")){
                        int x=deposite(balance1,amount);
                        if(x==balance1) System.out.println("Invalid Amount");
                        else{
                            System.out.println("Deposite : " +amount);
                            balance1=x;
                            System.out.println("New Balance : " +balance1);
                        }
                    }
                    else{
                        int x=deposite(balance2,amount);
                        if(x==balance2) System.out.println("Invalid Amount");
                        else{
                            System.out.println("Deposite : " +amount);
                            balance2=x;
                            System.out.println("New Balance : " +balance2);
                        }
                    }
                }
                else{
                    if(w.equals("wallet1")){
                        int x=withdraw(balance1,amount);
                        if(balance1==x) System.out.println("Invalid Amount");
                        else{
                            System.out.println("Withdraw : " +amount);
                            balance1=x;
                            System.out.println("New Balance : " +balance1);
                        }
                    }
                    else{
                        int x=withdraw(balance2,amount);
                        System.out.println("Withdraw : " +amount);
                        balance2=x;
                        System.out.println("New Balance : " +balance2);
                    }
                }
            }

            balance1+=20;
            System.out.println("Add Amount : " +20);
            System.out.println("New Balance : " +balance1);
            
            balance2+=50;
            System.out.println("Add Amount : " +50);
            System.out.println("New Balance : " +balance2);
        }
    }
}


/*
        Input :
        
        6
        deposite
        wallet1
        -1
        deposite
        wallet2
        -5
        deposite
        wallete1
        50
        withdraw
        wallete1
        50
        deposite
        wallete2
        50
        withdraw
        wallete2
        50

        Output :

        Invalid Amount
        Invalid Amount
        Deposite : 50
        New Balance : 50
        Withdraw : 50
        New Balance : 0
        Deposite : 50
        New Balance : 50
        Withdraw : 50
        New Balance : 0
        Add Amount : 20
        New Balance : 20
        Add Amount : 50
        New Balance : 50
*/