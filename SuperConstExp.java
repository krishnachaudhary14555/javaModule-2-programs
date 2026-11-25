class Person {
    String name ;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Person : "+name+" Age: "+age);
    }
    void display(){
        System.out.println("Name: "+name+ " | Age: "+age);
       
    }
}

class Employee extends Person{
    String company;
    double salary;
    Employee(String name, int age, String company, double salary){
        super(name, age); // calling parent class constructor
        this.company=company;
        this.salary=salary;
        System.out.println("Employee : "+name+" Age: "+age+" Company: "+company+" Salary: "+salary);
        
    
    }
  void showDetails(){
    super.display(); // calls Person's display() method
    System.out.println("Company: "+company+" | Salary: "+salary);
  }
  
}
class SuperConstExp {
    public static void main(String args[]){
        Employee emp=new Employee("John", 30, "ABC Corp", 50000.0);
        emp.showDetails();
    }
}








// public class SuperConstExp {
    
// }
