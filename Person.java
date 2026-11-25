public class Person {
    String name ;
    int age ;
    String address;

    //default constructor
    Person(){
        name=null;
        age=0;
        address=null;
    };
    Person(String n ,int a, String ad){
        this.name=n;
        this.age=a;
        this.address=ad;
    }

    void display(){
        System.out.println("Name :"+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }

    void modifier(String n,int a, String ad){
        this.name = n;
        this.age=a;
        this.address=ad;
    }

    public static void main(String args[]){
        Person p1=new Person();
        Person p2 =new Person("Harsh",22,"Delhi");

        System.out.println("Person 1 deatils: ");
        p1.display();
        System.out.println("Person 2 deatils: ");
        p2.display();

        p2.modifier("Krishna",19,"Benguluru");
        System.out.println("Person 2 details agter modification : ");
        p2.display();
        
    }

}
