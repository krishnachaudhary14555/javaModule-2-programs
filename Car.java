public class Car {
    String brand;
    String model;
    int year;

    public Car(){
        this.brand=null;
        this.model=null;
        this.year=0;
    }
    public Car(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("Car's Brand is : "+brand);
        System.out.println("Car's model is : "+model);
        System.out.println("Year of manufacture is : "+year);
    }

    public static void main(String[] args) {
        Car c1= new Car();
        c1.display();
        System.out.println("------------- Parameterized Constructor -------");
        Car c2 = new Car("Rang Rover","Mahindra",1000000);
        c2.display();
    }
}


// call by value / call by reference 