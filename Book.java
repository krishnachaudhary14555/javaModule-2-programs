//title  , author, price 
// import java.util.*;
public class Book {
    String title;
    String author;
    double price;

    public Book(){
         this.title=null;
         this.author=null;
         this.price=0.0;

    }
    public Book(String title, String author,double price){
        this.title = title;
        this.author= author;
        this.price=price;
    }
    void display(){
        System.out.println("Title of this book is : "+title);
        System.out.println("Author of the book is: "+author);
        System.out.println("Price of this book is : "+price);

    }

    public static void main(String[] args) {
        System.out.println("------------- DEfault constructor----------");
        Book obj1= new Book();
        obj1.display();
        System.out.println("--------- Parameterized constructor-------");
        Book obj2 = new Book("Java","Bala",273.50);
        obj2.display();
    }
}
