interface Transportable {
 void start();
 void stop();
} 

class Car implements Transportable {
    String model;
    Car(String model){
        this.model=model;

    }
    public void start(){
        System.out.println(model + " is starting");
    }
    public void stop(){
        System.out.println(model + " is stopping");
    }
}

class Bicycle implements Transportable{
    String brand;
    Bicycle(String brand){
        this.brand=brand;
    }
    public void start(){
        System.out.println(brand + " bicycle is starting");
    }
    public void stop(){
        System.out.println(brand + " bicycle is stopping");
    }
}

public class TransportationDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        Bicycle bicycle = new Bicycle("Giant");

        car.start();
        car.stop();

        bicycle.start();
        bicycle.stop();
    }
}
