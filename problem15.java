// problem 1(f);
import java.util.*;

public class problem15 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
            double s=(a+b+c)/(double) 2;
            double val=s*(s-a)*(s-b)*(s-c);
            double area=Math.sqrt(val);

            System.out.printf("%.3f\n",area);
        }
    }
}
