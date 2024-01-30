package program_hv;

import java.util.Scanner;
public class leap_year_6
{
    public static void main ()
    {
        System.out.println("\f");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of days in year:");    
        double n= sc.nextDouble();
        if (n==366)
         System.out.println("it is a leap year");
         else if (n==365)
         System.out.println(" it is not a leap year");
         else 
         System.out.println(" invalid input!!");
    }
}
