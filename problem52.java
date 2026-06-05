// problem 5(b);
import java.util.*;

class Dog{
    String name,breed;
    int age;
    Dog(String n,String b,int a){
        this.name=n;
        this.breed=b;
        this.age=a;
    }

    void bark(){
        System.out.println("Gew Gew");
    }

    void do_spin(){
        System.out.println("Can do spin");
    }

    void run(){
        System.out.println("Can run faster");
    }
}

public class problem52 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String name=sc.nextLine();
            String breed=sc.nextLine();
            int age=sc.nextInt();

            Dog dog=new Dog(name,breed,age);
            dog.bark();
            dog.do_spin();
            dog.run();

            System.out.println(dog.age);
            System.out.println(dog.name);
            System.out.println(dog.breed);
        }
    }
}
