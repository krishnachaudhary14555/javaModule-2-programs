
class A {
    int a;
    void display(){
        a=10;
        System.out.println("Value of a: "+a);
    }
}
class B extends A {
    int b;
    void display(){

        System.out.println("Value of b: "+b);
    }
}

class C extends B  {
    int c=30;
    void display(){
        System.out.println("Value of b: "+b);
        System.out.println("Value of c: "+c);
    }
}

public class Multilevel_inherit {
    public static void main(String args[]){
        
       C obj1=new C();
      obj1.display();
    }
}
