// problem 4(b);
import java.util.*;

record MyTuple(String C, String B, String P,int Price) {}

public class problem41 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            Vector<MyTuple> v = new Vector<>();
            v.add(new MyTuple("Electronics","Apple","iPhone15",999));
            v.add(new MyTuple("Electronics","Apple","iPadAir",599));
            v.add(new MyTuple("Electronics","Samsung","GalaxyS24",799));
            v.add(new MyTuple("Fashion","Nike","AirMaxShoes",150));
            v.add(new MyTuple("Fashion","Nike","TechFleeceHoodie",110));
            v.add(new MyTuple("Fashion","Adidas","UltraboostShoes",180));

            String s=sc.nextLine();
            if(s.equals("Category")){
                String c=sc.nextLine();
                for(MyTuple it:v){
                    if(it.C().equals(c)){
                        System.out.println(it.C() +" " +it.B() +" " +it.P() +" " +it.Price());
                    }
                }
            }
            else if(s.equals("pricerange")){
                int a=sc.nextInt(),b=sc.nextInt();
                for(MyTuple it:v){
                    if(it.Price()>=a && it.Price()<=b){
                        System.out.println(it.C() +" " +it.B() +" " +it.P() +" " +it.Price());
                    }
                }
            }
            else if(s.equals("brand")){
                String b=sc.nextLine();
                for(MyTuple it:v){
                    if(it.B().equals(b)){
                        System.out.println(it.C() +" " +it.B() +" " +it.P() +" " +it.Price());
                    }
                }
            }
            else if(s.equals("categoryAndPricerange")){
                String c=sc.nextLine();
                int a=sc.nextInt(),b=sc.nextInt();
                for(MyTuple it:v){
                    if(it.C().equals(c) && it.Price()>=a && it.Price()<=b){
                        System.out.println(it.C() +" " +it.B() +" " +it.P() +" " +it.Price());
                    }
                }
            }
            else if(s.equals("categoryPricerangeAndBrand")){
                String c=sc.nextLine(),br=sc.nextLine();
                int a=sc.nextInt(),b=sc.nextInt();
                for(MyTuple it:v){
                    if(it.C().equals(c) && it.B().equals(br) && it.Price()>=a && it.Price()<=b){
                        System.out.println(it.C() +" " +it.B() +" " +it.P() +" " +it.Price());
                    }
                }
            }
        }   
    }
}
