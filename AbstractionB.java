abstract class Shape{
    public abstract double calcArea();
    public abstract double calcPerimeter();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double calcArea(){
        return 3.14*radius*radius;
    }
    public double calcPerimeter(){
        return 2*3.14*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calcArea(){
        return length*breadth;
    }
    public double calcPerimeter(){
        return 2*(length+breadth);
    }
}
public class AbstractionB {
    public static void main(String args[]){
        Circle c= new Circle(7);
        Rectangle r = new Rectangle(5,10);
        System.out.println("Area of Circle = "+c.calcArea());
        System.out.println("Perimeter of Circle = "+c.calcPerimeter());
        System.out.println("Area of Rectangle = "+r.calcArea());
        System.out.println("Perimeter of Rectangle = "+r.calcPerimeter());
    }
}
