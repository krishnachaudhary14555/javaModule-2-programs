class Animal{
    String name;
    void eat(){
        System.out.println(name+ "is eating");
    }
    void sleep(){
        System.out.println(name+ "is Sleeping");
    }
}
 class Dog extends Animal {
    void bark(){
        System.out.println(name+ "says Woof");
    }
 }




public class Inherit {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Tommy";             // inherited from Animal class
        d.eat();                    // inherited from Animal class
        d.sleep();                  // inherited from Animal class  
        d.bark();             // defined in Dog class
    }
}

// based-derived class  
//which is based ,parent class or child class is called derived class and the class from which it is derived is called base class or parent class. In this example, Dog is the derived class and Animal is the base class.
