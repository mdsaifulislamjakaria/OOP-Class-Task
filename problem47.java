// problem 4(h);
import java.util.*;

public class problem47{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String s=sc.nextLine();
            String p=""; 
            for(int i=s.length()-1;i>=0;i--){
                p+=s.charAt(i);
            }

            System.out.println(p);
        }
    }
}

/*

        Input :
        12345
        Output :
        54321

*/