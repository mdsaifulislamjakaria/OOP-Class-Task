// problem 1(b);
import java.util.*;

public class problem11 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            double pi=Math.PI;
            double redius=sc.nextDouble();
            double volume=((double) 4/(double) 3)*pi*redius*redius*redius;
            System.out.printf("%.3f\n",volume);
        }
    }
}
