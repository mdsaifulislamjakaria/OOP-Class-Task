// problem 4(a);
import java.util.*;

class Car{
    public String Owner,Brand;
    int SerialNumber,FuelLevel;
    Car(String ow,String b,int sn,int F){
        this.Owner=ow;
        this.Brand=b;
        this.SerialNumber=sn;
        this.FuelLevel=F;
    }

    void start(){
        System.out.println("Start");
        System.out.println("Fuel are decrease continously");
        FuelLevel--;
    }

    void stop(){
        System.out.println("Stop");
    }

    void check_fuel(){
        System.out.println(FuelLevel);
    }
}

public class problem51 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String owner=sc.nextLine(); 
            String brand=sc.nextLine();

            int serialnumber=sc.nextInt();
            int fuellevel=sc.nextInt();
            Car car=new Car(owner,brand,serialnumber,fuellevel);

            car.start();
            car.stop();
            car.check_fuel();
            System.out.println(car.SerialNumber);
        }
    }
}
