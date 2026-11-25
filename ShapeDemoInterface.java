interface Shape {
    void calcArea();
    void calcPerimeter();
}

class Circle implements Shape {
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

class Rectangle implements Shape {
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

public class ShapeDemoInterface
 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.calcArea();
        c.calcPerimeter();

        r.calcArea();
        r.calcPerimeter();
    }
}















    