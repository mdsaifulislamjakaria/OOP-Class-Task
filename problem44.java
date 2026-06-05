// problem 4(e);
import java.util.*;

class Wallet{
    int balance,counter=0;
    Wallet(int cnt){
        this.balance=0; this.counter+=cnt;
    }
}

public class problem44 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt(),counter=0;
            Map<Integer, Integer> Id = new HashMap<>();

            for(int i=0;i<n;i++){
                int amount=sc.nextInt();

                Wallet w=new Wallet(counter+1);
                counter=w.counter; Id.put(counter,amount);
                System.out.println(counter +" " +Id.get(counter));
            }
        }
    }
}

/*
        Input :
        5
        10
        20
        30
        40
        50

        Output :
        1 10
        2 20
        3 30
        4 40
        5 50

*/