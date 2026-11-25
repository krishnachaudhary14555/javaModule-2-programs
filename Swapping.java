import java.util.*;
public class Swapping {
    Scanner sc = new Scanner(System.in);
    int a,b;
    public  Swapping(int x,int y){
        this.a = x;
        this.b = y;
    }
    void CallbyValue(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping in call by value method : "+a+" "+b);
    }

    void CallbyReference(Swapping obj){
        int temp;
        temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
        System.out.println("After swapping in call by reference method : "+obj.a+" "+obj.b);
    }
    public static void main(String[] args) {
        Swapping obj1 = new Swapping(10, 20);
        int a=10,b=20;
       System.out.println("Call by values before swapping : a = "+a+" b ="+b);
        obj1.CallbyValue(a,b);
        System.out.println("Call by values after swapping : "+a+" "+b);

System.out.println("----------------------------------- ");
        Swapping obj2 = new Swapping(30, 40);
        System.out.println("Call by reference before swapping : a = "+obj2.a+" b = "+obj2.b);
        obj2.CallbyReference(obj2);
        System.out.println("Call by reference after swapping : a = "+obj2.a+" b = "+obj2.b);

       
    
    }
}