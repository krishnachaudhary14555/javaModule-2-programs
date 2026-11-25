import java.util.*;
public  class Rectangle{

    // variable decalaration area
    float length , breath,area;
    Scanner  sc= new Scanner(System.in);

    //method declaration area   

    /*access-modifier return-type ,ethod-name(para1, para2 ..){
    body of the method

    return value;
    }
        */

    // abstract data type 
    void getData(){
        System.out.println("Enter the length of rectangle: ");
        length = sc.nextFloat();
        System.out.println("Enter the breath of rectangle: ");
        breath = sc.nextFloat();
    }
    void calcArea(){
        // V2
        getData();
        area = length * breath;
    }

    void displayData(){
        calcArea(); // ver-2
        System.out.println("Rectagle length is : "+length);
        System.out.println("Rectagle breath is : "+breath);
        System.out.println("Area of Rectangle is : "+area);

    }

    public static void main(String args[]){
        // class-name / datatype/abstract variable ref-var-name = keyword-that-cretaes-obj constructor-name-insitialiaze defalut-var-for-inst-var
        Rectangle obj1 = new Rectangle();
        // obj1.getData();
        // obj1.calcArea();
        // obj1.displayData();

    obj1.displayData(); // ver-2

    }



}



/*
this program defines a student class with attributes 
like student id , name , age, and grade .
It also provide methods to set and get these attributes,
 along with a method to 
 display the student details  
 */