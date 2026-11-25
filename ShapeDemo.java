abstract class Shape {
    public abstract void calcArea();
    public abstract void calcPerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calcArea() {
        System.out.println("Circle Area: " + Math.PI * radius * radius);
    }

    public void calcPerimeter() {
        System.out.println("Circle Perimeter: " + 2 * Math.PI * radius);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calcArea() {
        System.out.println("Rectangle Area: " + length * breadth);
    }

    public void calcPerimeter() {
        System.out.println("Rectangle Perimeter: " + 2 * (length + breadth));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.calcArea();
        c.calcPerimeter();

        r.calcArea();
        r.calcPerimeter();
    }
}