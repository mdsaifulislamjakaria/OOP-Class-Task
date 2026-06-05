// problem 1(d);
import java.util.*;

public class problem13 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            double C=sc.nextDouble();
            double F=((double) 9*C)/(double) 5+(double) 32;
            System.out.printf("%.3f\n",F);
        }
    }
}
