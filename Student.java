/*
this program defines a student class with attributes 
like student id , name , age, and grade .
It also provide methods to set and get these attributes,
 along with a method to 
 display the student details  
 */

import java.util.*;
public class Student {
    int id, age;
    String name;
    char grade;
    Scanner sc= new Scanner(System.in);

    //method area

    void getData(){
        System.out.print("Enter student ID : ");
        id = sc.nextInt();
        System.out.print("Enter age : ");
        age= sc.nextInt();
        System.out.print("Enter student name : ");
        name = sc.next();
        System.out.print("Enter grade : ");
        grade = sc.next().charAt(0);

    }

    void displayData(){
        getData();
        System.out.println("------- Details --------");
        System.out.println("Student ID : "+id);
        System.out.println("Student age : "+age);
        System.out.println("Student Name : "+name);
        System.out.println("Student Grade : "+grade);
    }
    

    public  static void main(String args[]){
        Student sd = new Student();
        
        sd.displayData();
    }
}
