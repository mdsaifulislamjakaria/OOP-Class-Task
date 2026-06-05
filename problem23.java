// problem 2(c);

public class problem23 {
    public static void main(String[] args){
        int a=2,b=1,sum=0;
        
        // use for loop
        for(int i=a;i<=20;i++) sum+=i;
        System.out.println(+sum); sum=0;
        
        for(int i=b;i<20;i++) sum+=i;
        System.out.println(sum); sum=0;
        
        // while loop
        a=2; b=1;
        while(a<=20){
            sum+=a; a++;
        } 
        System.out.println(sum); sum=0;

        while(b<20){
            sum+=b; b++;
        } 
        System.out.println(sum);

        // Do while loop 
        a=2; b=1; sum=0;
        do{ 
            sum+=a; a++;
        } 
        while (a<=20);
        System.out.println(sum); sum=0;

        do{ 
            sum+=b; b++;
        } 
        while (b<20);
        System.out.println(sum);
    }
}
