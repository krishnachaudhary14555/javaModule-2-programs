/*class -> 2 matrix   3x3 ->  data input method ->  matix multiplication by using method -> return 
crete  a class ->1.get data method -> input two array od 3x3 -> 2.crete method method multipli -> pass these two array -> calc multi -> return from there - call into display method 
and call that display method in main method */
import java.util.*;
public class ArrayMethodOver {
    int arr1[][] = new int[3][3];
    int arr2[][] = new int[3][3];
    Scanner sc= new Scanner(System.in);
    
    void getData(){
        System.out.println("Enter the elements of first 3x3 matrix:");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j] = sc.nextInt();
               
            }
           
        }
        System.out.println("Enter the elements of second 3x3 matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j] = sc.nextInt();
            }
            
        }
    }
    int[][] calcMultiplication(int arr1[][],int arr2[][]){
        int result[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               for(int k=0;k<3;k++){
                   result[i][j] += arr1[i][k] * arr2[k][j];
               }
            }
        }
       return result;
    }
    void display(int result[][]){
        System.out.println("Result of matrix multiplication:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

public static void main(String args[]){
    ArrayMethodOver obj = new ArrayMethodOver();
    obj.getData();
    int result[][] = obj.calcMultiplication(obj.arr1,obj.arr2);
    obj.display(result);
}
}
