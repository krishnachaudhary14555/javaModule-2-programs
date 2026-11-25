class Vehicle{
    String vehicleNum;
    String brand;
    double rentPerDay;
    Vehicle(String vnum, String b, double rent){
        this.vehicleNum=vnum;
        this.brand=b;
        this.rentPerDay=rent;

    }
}
class Car extends Vehicle{
    String model;
    int seatingCapacity;
    String fuelType;
    Car(String vnum, String b, double rent, String model, int seatingCapacity, String fuelType){
        super(vnum, b, rent);
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    void calcRent(int days){
        double totalRent = days * rentPerDay;
        System.out.println("Total rent for " + days + " days: " + totalRent);
    }

    void display(){
        System.out.println("Vehicle Number: " + vehicleNum);
        System.out.println("Brand: " + brand);
        System.out.println("Rent per Day: " + rentPerDay);
        System.out.println("Model: " + model);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("KA-01-AB-1234", "Toyota", 2000, "Camry", 5, "Petrol");
        car.display();
        car.calcRent(3);
    }
}
