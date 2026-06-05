// problem 1(j);
import java.util.*;

public class problem19 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt(),b=sc.nextInt();
            char ch=sc.next().charAt(0);
            if(ch=='+') System.out.println("Addition : " +(a+b));
            if(ch=='-') System.out.println("Subtraction : " +(a-b));
            if(ch=='*') System.out.println("Multiplication : " +(a*b));
            if(ch=='/') System.out.println("Subtraction : " +(a/b));
        }
    }
}
