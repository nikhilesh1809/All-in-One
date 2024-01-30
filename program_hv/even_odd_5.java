package program_hv;

import java.util.Scanner;
public class even_odd_5
{
    public static void main ()
    {
        System.out.println("\f");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number:");    
        double n= sc.nextDouble();
        if (n%2==0)
         System.out.println(n+" is even number");
         else
         System.out.println(n+" is odd number");
    }
}

