// problem 3(g);
import java.util.*;

public class problem37 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            ArrayList<Integer>v=new ArrayList<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                v.add(a);
            }

            int even=0,odd=0;
            for(int i=0;i<n;i++){
                int val=v.get(i);
                if(val%2==0) even++;
                else odd++;
            }

            System.out.println("Even Number : " +even);
            System.out.println("Odd Number : " +odd);
        }
    }
}
