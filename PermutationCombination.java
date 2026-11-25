// Take 'n'nand 'r' as input and print nCr and nPr.
/*
nCr = n!/r!*(n-r)!     AND  nPr = n! / (n-r)! */

import java.util.*;
public class PermutationCombination {

    public static int fact(int x){
        int fact =1;
        for(int i=1; i<=x; i++){
            fact *=i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();

        int nCr = fact(n)/ (fact(r) * fact(n-r));
        int nPr = fact(n)/fact(n-r);
        System.out.println("Combination is :"+nCr);
         System.out.println("Permutation : "+nPr);
        sc.close();
       


    }
    
}
