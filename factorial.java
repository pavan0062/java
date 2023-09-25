import java.io.*;
import java.util.*;
     public class Factorial_Demo
     {
         public static void main(String ags[])
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter a n positive integer to find factorial ");
             int n=sc.nextInt();
             int fact=1;
             for(int i=2;i<=n;i++)
             {
                 fact=fact*i;
             }
             System.out.println("Factorial of "+n+" is "+fact);
         }
     }
