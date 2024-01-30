package program_hv;

import java.util.Scanner;
public class leap_year_d4_6
{
    public static void main ()
    {
        System.out.println("\f");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of days in year:");    
        double n= sc.nextDouble();
        if (n%4==0)
         System.out.println(n+" is a leap year");
         else 
         System.out.println(n+" is not a leap year");
    
    }
}
