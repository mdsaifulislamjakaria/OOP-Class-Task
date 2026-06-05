// problem 3(f);
import java.util.*;

public class problem36 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            ArrayList<Integer>v=new ArrayList<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                v.add(a);
            }

            for(int i=n-1;i>=0;i--){
                System.out.print(v.get(i) +" ");
            }
        }
    }
}
