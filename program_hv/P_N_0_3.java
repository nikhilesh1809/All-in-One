package program_hv;

import java.util.Scanner;
public class P_N_0_3
{
    public static void main ()
    {
      System.out.println("\f");  
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter the number:");  
      double n=sc.nextDouble();
      if (n==0)
      System.out.println("The number "+ n+" is zero (0)");  
      else if (n>0)
      System.out.println("The number "+ n+" is positive number (+)");
      else if (n<0)
      System.out.println("The number "+ n+" is negative number (-)");
      else 
      System.out.println("invalid input!!");
    }    
}
