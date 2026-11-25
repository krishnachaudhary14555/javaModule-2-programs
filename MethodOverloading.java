//signature are same(name and return type) but parameters are different





public class MethodOverloading {
    int area(int x,int y){
        int result = x*y;
        return result;
    }
    float area(float r){
        float result = 3.14f * r * r;
        return result;
    }
    double area(double l){
        double result = l*l;
        return result;
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int area1 = obj.area(10,20);
        System.out.println("Area of rectangle is : "+area1);
        float area2 = obj.area(5.5f);
        System.out.println("Area of circle is : "+area2);
        double area3 = obj.area(10.5);
        System.out.println("Area of square is : "+area3);
    }
}

//Questions  -> why we use method overloading?
// Method overloading is used to increase the readability of the program. It allows us to define multiple methods with the same name but different parameters, making it easier to understand and use the methods in different contexts. It also helps in code reusability and reduces the complexity of the code by avoiding the need for multiple method names for similar operations.


//where main is stores in the memeory?
// The main method is stored in the stack memory.

// static has its native environment seperate from the instance of the class. It is loaded into memory when the class is loaded by the JVM. The main method is static, so it is stored in the method area of the JVM memory, which is part of the heap memory.

// but non static methods are stored in the heap memory, which is used for dynamic memory allocation. When an object of the class is created, the non-static methods are loaded into the heap memory along with the object.

// The main method is stored in the method area of the JVM memory, which is part of the heap memory. The method area is a shared memory area that stores class-level data, including static variables and methods. When the JVM loads a class, it allocates memory for the class's static members in the method area. Since the main method is static, it is stored in this area and can be accessed without creating an instance of the class.