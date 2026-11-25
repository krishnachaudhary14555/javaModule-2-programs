
class PrimaryClass{
    public String name;
    private int age;

    private void  getData(String a, int b){
        this.name=a;
        this.age=b;
    }
    public void modifyData(int b){
        getData(this.name, b); // Call the private method to set the age
        this.age=this.age+b;
    }

    public void displayData(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}


public class AccessModifiiers {
    public static void main(String args[]){
        PrimaryClass obj=new PrimaryClass();
        obj.name="John";
        // obj.age=25; // This line will cause a compilation error because 'age' is private
        // obj.getData("John", 25); // This line will cause a compilation error because 'getData' is private
        obj.modifyData(25);
        obj.displayData();
    }
    
}
