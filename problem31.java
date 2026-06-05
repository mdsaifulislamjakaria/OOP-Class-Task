// problem 3(a);
import java.util.*;

public class problem31 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            double sum=0;
            ArrayList<Double>v = new ArrayList<>();
            for(int i=0;i<n;i++){
                double a=sc.nextDouble(); v.add(a);
            }

            for(int i=0;i<n;i++){
                sum+=v.get(i);
            }
            double ans=(sum/n);
            System.out.printf("%.5f",ans);
        }
    }
}
