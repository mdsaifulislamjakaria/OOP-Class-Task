// problem 8(b);
import java.util.*;

class Restaurant {
    protected String name;
    protected double taxRate = 0.10; 

    public Restaurant(String name) {
        this.name = name;
    }

    public void estimateDeliveryTime() {
        System.out.println(name + "Delivery Time : 40 minute");
    }

    public void calculateTotalBill(double foodPrice) {
        double tax = foodPrice * taxRate;
        double totalBill = foodPrice + tax;
        System.out.println(name + " Total Bill : " + totalBill + " taka");
    }
}

class FastFoodRestaurant extends Restaurant {
    public FastFoodRestaurant(String name) {
        super(name);
        this.taxRate = 0.15; 
    }

    @Override
    public void estimateDeliveryTime() {
        System.out.println(name +"Delivery Time : 20 minute");
    }

    @Override
    public void calculateTotalBill(double foodPrice) {
        double tax = foodPrice * this.taxRate;
        double totalBill = foodPrice + tax;
        System.out.println(name +" Total Bill : " +totalBill +" taka");
    }
}

class FineDiningRestaurant extends Restaurant {

    public FineDiningRestaurant(String name) {
        super(name);
    }

    @Override
    public void estimateDeliveryTime() {
        System.out.println(name + "Delivery Time : 60 minute");
    }
}

public class problem82 {
    public static void main(String[] args) {
        //try(Scanner sc=new Scanner(System.in)){
            Restaurant generalRest = new Restaurant("Shadin Bangla");
            generalRest.estimateDeliveryTime();
            generalRest.calculateTotalBill(500);
            

            FastFoodRestaurant fastFood = new FastFoodRestaurant("Burger Kingdom");
            fastFood.estimateDeliveryTime(); 
            fastFood.calculateTotalBill(500); 
            

            FineDiningRestaurant fineDining = new FineDiningRestaurant("Royal Dine");
            fineDining.estimateDeliveryTime(); 
            fineDining.calculateTotalBill(500); 
        //}
    }
}
