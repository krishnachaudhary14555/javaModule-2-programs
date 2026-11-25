
 abstract class Shape{
    abstract void area();
}

class Circle extends Shape {
    void area(){
        double area=3.14*7*7;
        System.out.println("Area of Circle = "+area);
    }
}

public class Abstraction {
    
    public static void main(String args[]){
        Circle c= new Circle();
        c.area();
}
}