class Person {
    String name;
    int age;
    Person(){
        this.name = null ;
        this.age = 0;
       
    }
    Person(String n , int a){
        this.name = n;
        this.age=a;
    }
    void display(){
        System.out.println("Name: "+name+ " | Age: "+age);
       
    }
}

class Student extends Person{
    int rollNo;
    String course;
    Student(){
        super();
        
    }
    Student(String n, int a, int r, String c){
        super(n,a);
    }
    Student(int r, String c){
        this("NA",0,r,c);
    }
    void displayDetails(){
        super.display();
        System.out.println("Roll No: "+rollNo+" | Course: "+course);
    }
}

    //3rd
    class ResearchScholar extends Student{
        String topic;
        String guide;

        ResearchScholar(String n, int a, int r, String c, String t, String g){
            super(n,a,r,c);
            this.topic=t;
            this.guide=g;
        }
        void display(){
            super.displayDetails();
            System.out.println("Research Topic: "+topic+" | Guide: "+guide);
        }
    }

public class MultiLevel_inherit2 {
     public static void main(String args[]){
        ResearchScholar rs = new ResearchScholar("Alice", 20, 101, "Computer Science", "Machine Learning", "Dr. Smith");
        rs.display();
        
    }
}
