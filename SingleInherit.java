

class A {
    int a = 10;
    int b = 20;
    void add(){
        System.out.println("Addition: "+(a+b));
    }

    void sub(){
        System.out.println("Subtraction: "+(a-b));
    }
}

class B extends A {
    int c=30;
    void mul(){
        System.out.println("Multiplication: "+(a*b*c));
    }
}

public class SingleInherit {
   
    public static void main(String args[]){

        B obj1=new B();
        obj1.add();
        obj1.sub();
        obj1.mul();
}
}
