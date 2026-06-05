// problem 1(a);
import java.util.*;

public class problem10 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            double base=sc.nextDouble(),height=sc.nextDouble(),half=0.5;
            double area=half*base*height;
            System.out.printf("%.3f\n",area);
        }
    }
}
