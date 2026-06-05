
// problem 2(b);
public class problem22 {
    public static void main(String[] args){
        int a=2,b=1;
        
        // use for loop
        for(int i=a;i<=20;i++) System.out.print(+i +" ");
        System.out.println("");
        
        for(int i=b;i<20;i++) System.out.print(+i +" ");
        System.out.println("");

        // while loop
        a=2; b=1;
        while(a<=20){
            System.out.print(+a +" "); a++;
        }
        System.out.println("");

        while(b<20){
            System.out.print(+b +" "); b++;
        }
        System.out.println("");

        // Do while loop
        a=2; b=1;
        do{ 
            System.out.print(+a +" "); a++;
        }
        while (a<=20);
        System.out.println("");

        do{ 
            System.out.print(+b +" "); b++;
        }
        while (b<20);
        System.out.println("");
    }
}
