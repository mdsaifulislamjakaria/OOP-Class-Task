// problem 4(i);
import java.util.*;

public class problem48 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String s=sc.nextLine(),p="";
            int n=s.length();
            for(int i=n-1;i>=0;i--){
                p+=s.charAt(i);
            }

            if(s.equals(p)) System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }
    }
}


/*

        Input :
        12344321
        Output :
        Palindrome

        Input :
        123443212
        Output :
        Not Palindrome

*/