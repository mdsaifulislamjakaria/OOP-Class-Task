// problem 3(c);
import java.util.*;

public class problem33 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            double Reached=sc.nextDouble(),attendance=sc.nextDouble();
            double target=sc.nextDouble(),total=sc.nextDouble();

            double p=(Reached*100.0)/target,q=(attendance*100)/total;
            if(p>=95.0 && q>=100.0) System.out.println("Bonus : 60%");
            else if(p>=95.0 && q>=90.0) System.out.println("Bonus : 40%");
            else if(p>=80.0 && q>=100.0) System.out.println("Bonus : 40%");
            else if(p>=80.0 && q>=90.0) System.out.println("Bonus : 20");
            else System.out.println("Bonus : 5%");
        }
    }
}
