import  java.util.Scanner;
import java.util.ArrayList;

abstract class Car{
    int distance = 0;
    String name, color;
    int fuel;
    private ArrayList<String> places = new ArrayList<String>();
    public Car(String name, String color, int fuel){
        this.name = name;
        this.color = color;
        this.fuel = fuel;
    }

    public abstract void sound();
    public void move(String place, int interval){
        if (this.fuel > 0){
            this.places.add(place);
            this.distance += interval;
            this.fuel -= 1;
        }
        else{
            System.out.println("Ran out of fuel.");
        }

    }
    public ArrayList<String> getPLaces(){
        return places;
    }
}
class Ford extends Car{

    public Ford(String name, String color, int fuel){
        super(name,color,fuel);
    }
    @Override
    public void sound() {
        System.out.println("Vryiinn");
    }
}
public class FirstClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name please: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, "+name);

        Ford ford1 = new Ford("Ford Mustang", "red", 2);
        ford1.sound();
        ford1.move("Brikston 12", 34);
        ford1.move("Holki 13", 23);
        ford1.move("Tork 32", 12);
    }
}
