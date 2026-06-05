// problem 3(b);
import java.util.*;

public class problem32 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            boolean complete_semester=true;
            double g=sc.nextDouble();

            if(complete_semester){
                if(g>=3.5){
                    System.out.println("Congratulations! You receive a medal.");
                }
            }
        }
    }
}
