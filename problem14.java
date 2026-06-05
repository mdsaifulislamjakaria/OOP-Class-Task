// problem 1(e);
import java.util.*;

public class problem14 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            double arm=sc.nextDouble();
            double x=Math.sqrt(3);
            double area=(x/(double) 4)*arm*arm;
            System.out.printf("%.3f\n",area);
        }
    }
}
