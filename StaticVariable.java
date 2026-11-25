
class Counter{
    static int count=0; // one shared copy
    String name;
    Counter(String name){
        this.name=name;
        count++; // every obj increments the count
    }
    static void showCount(){
        System.out.println("Total : "+count);
    }
}
public class StaticVariable {
    public static void main(String args[]){
        Counter c1 = new Counter("Alice");
        Counter c2 = new Counter("Bob");
        Counter c3 = new Counter("Charlie");
        Counter.showCount();
       System.out.println("Counter 1 :"+ Counter.count + "Name: "+c1.name);
        System.out.println("Counter 2 :"+ Counter.count + "Name: "+c2.name);
         System.out.println("Counter 3 :"+ Counter.count + "Name: "+c3.name);   
    }
}
