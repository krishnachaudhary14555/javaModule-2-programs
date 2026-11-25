import java.util.*;
public class BookInput {
    String title;
    String author;
    double price;

    public BookInput(){
         this.title=null;
         this.author=null;
         this.price=0.0;
    }
    public BookInput(String title, String author,double price){
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
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter title of the Book: ");
        String title= sc.next();
        System.out.print("Enter Author of the Book: ");
        String author= sc.next();
        System.out.print("Enter price of the Book: ");
        double price= sc.nextDouble();

        System.out.println("------------- Default constructor----------");
        Book obj1= new Book();
        obj1.display();
        System.out.println("--------- Parameterized constructor-------");
        Book obj2 = new Book(title,author,price);
        obj2.display();
        sc.close();
    }
}
