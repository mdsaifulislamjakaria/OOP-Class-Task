// problem 3(d);
import java.util.*;

public class problem34 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            ArrayList<Integer>v=new ArrayList<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                v.add(a);
            }

            int ans=0;
            for(int i=0;i<n;i++){
                ans=Math.max(ans,v.get(i));
            }

            System.out.println(ans);
        }
    }
}
