// problem 2(a);
import java.util.*;

public class problem21 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            if(a%400==0) System.out.println("Leap Year");
            else if(a%4==0 && a%100!=0) System.out.println("Leap Year");
            else System.out.println("NOt Leap Year");
        }
    }
}
