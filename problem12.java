// problem 1(c);
import java.util.*;

public class problem12 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            double pi=Math.PI;
            double redius=sc.nextDouble();
            double area=pi*redius*redius;
            System.out.printf("%.3f\n",area);
        }
    }
}
