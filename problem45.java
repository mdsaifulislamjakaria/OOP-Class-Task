// problem 4(f);
import java.util.*;

class Wallet {
    private String ownerName,lastWithdrawMode;
    private double balance;

    public Wallet(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.lastWithdrawMode = "NONE"; 
    }

    public double getBalance() {
        return balance;
    }

    public String getLastWithdrawMode() {
        return lastWithdrawMode;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Taka deposited to " + ownerName + "'s wallet.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            this.lastWithdrawMode = "NORMAL"; 
            System.out.println("Withdrawn " + amount + " Taka (NORMAL mode) from " + ownerName + "'s wallet.");
        } 
        else {
            System.out.println("Withdrawal failed from " + ownerName + "'s wallet : invalid amount.");
        }
    }

    public void withdraw(double amount, String mode) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            this.lastWithdrawMode = mode.toUpperCase(); 
            System.out.println("Withdrawn " + amount + " Taka (" + this.lastWithdrawMode + " mode) from " + ownerName + "'s wallet.");
        } 
        else {
            System.out.println("Withdrawal failed from " + ownerName + "'s wallet : invalid amount.");
        }
    }

    @Override
    public String toString() {
        return "Wallet[Owner: " + ownerName + ", Balance: " + balance + " Taka, Last Withdraw Mode: " + lastWithdrawMode + "]";
    }
}

public class problem45 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            Wallet walletRahim = new Wallet("Rahim", 1000);
            System.out.println("Initial State: " + walletRahim + "\n");

            walletRahim.withdraw(200); 
            System.out.println("After Normal Withdraw: " + walletRahim + "\n");

            walletRahim.withdraw(300, "ATM"); 
            System.out.println("After ATM Withdraw: " + walletRahim + "\n");

            walletRahim.withdraw(150, "ONLINE"); 
            System.out.println("After ONLINE Withdraw: " + walletRahim + "\n");

            System.out.println("Last Withdraw Mode: " + walletRahim.getLastWithdrawMode());
        }
    }
}
