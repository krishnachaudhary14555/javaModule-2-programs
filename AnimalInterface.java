interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    String dogFood;
    Dog(String dogFood){
        this.dogFood = dogFood;
    }
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog is eating dog food");
    }
}
class Cat implements Animal{
    String catFood;
    Cat(String catFood){
        this.catFood = catFood;
    }
    public void sound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat is eating cat food");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {
        Dog d = new Dog("Dog Food");
        Cat c = new Cat("Cat Food");

        d.sound();
        d.eat();

        c.sound();
        c.eat();
    }
}

