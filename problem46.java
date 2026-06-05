// problem 4(g);
import java.util.Scanner;

class Wallet {
    private String ownerName;
    private double balance;

    public Wallet(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Wallet[Owner: " + ownerName + ", Balance: " + balance + " Taka]";
    }
}

class WalletUtility {
    public static void addBonus(Wallet walletRef, double bonusAmount) {
        System.out.println("\nAdding bonus");
        if (walletRef != null && bonusAmount > 0) {
            walletRef.deposit(bonusAmount);
            System.out.println(bonusAmount + " Taka bonus added to " + walletRef.getOwnerName() + "'s wallet.");
        }
    }

    public static void swapWallets(Wallet w1, Wallet w2) {
        System.out.println("\nAttempting to swap wallets");
        Wallet temp = w1;
        w1 = w2; w2 = temp;
        System.out.println("w1 points to " + w1.getOwnerName() + ", w2 points to " + w2.getOwnerName());
    }
}

public class problem46 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            Wallet walletRahim = new Wallet("Rahim", 1000);
            Wallet walletKarim = new Wallet("Karim", 1500);

            System.out.println("Initial State:");
            System.out.println(walletRahim);
            System.out.println(walletKarim);

            WalletUtility.addBonus(walletRahim, 500);
            System.out.println("After Bonus : " + walletRahim + "\n"); 

            System.out.println("State before swap attempt (in main):");
            System.out.println("walletRahim points to: " + walletRahim.getOwnerName());
            System.out.println("walletKarim points to: " + walletKarim.getOwnerName());

            WalletUtility.swapWallets(walletRahim, walletKarim);

            System.out.println("\nState after swap attempt (in main):");
            System.out.println("walletRahim points to: " + walletRahim.getOwnerName()); // রহিমই আছে
            System.out.println("walletKarim points to: " + walletKarim.getOwnerName()); // করিমই আছে
        }
    }
}
