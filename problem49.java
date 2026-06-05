// problem 4(j);
import java.util.*;

public class problem49 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            Map<Character,Integer>mp=new HashMap<>();
            String s=sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            }

            mp.forEach((key, value) -> System.out.println(key + " -> " + value));
        }
    }
}


/*
        Input :
        112223333444446
        Output :
        1 -> 2
        2 -> 3
        3 -> 4
        4 -> 5
        6 -> 1

*/