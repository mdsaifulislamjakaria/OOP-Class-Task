// problem 3(e);
import java.util.*;

public class problem35 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            
            int cnt=0;
            for(int i=1;i<=n;i++){
                if(n%i==0) cnt++;
            }

            if(cnt<=2) System.out.println("Prime");
            else System.out.println("Not Prime");
        }
    }
}
