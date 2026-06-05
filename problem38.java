// problem 3(h);
import java.util.*;

public class problem38 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            ArrayList<Integer>v=new ArrayList<>();
            v.add(0); v.add(1);
            for(int i=2;i<=n;i++){
                int val=v.get(i-1)+v.get(i-2);
                v.add(val);
            }

            for(int i=0;i<=n;i++) System.out.print(v.get(i) +" ");
            System.out.println("");
        }
    }
}
