
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
   
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    
    void sound(){
        System.out.println("Cat meows");
    }
}
public class RuntimePolim {
    public static void main(String args[]){
        Animal a;
        a=new Animal();
        a.sound();
        a= new Dog();
        a.sound();
        a= new Cat();
        a.sound();
    }

}
// object always be of super class in overriding 