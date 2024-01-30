 package program_hv;

import java.util.Scanner;
public class max_three_2
{
    public static void main ()
    {
        System.out.println("\f");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number 1:");
        double n1= sc.nextDouble();
        System.out.println("Enter number 2:");
        double n2= sc.nextDouble();
        System.out.println("Enter number 3:");
        double n3= sc.nextDouble();
        if (n1> n2 && n1>n3)
        {
            System.out.println("max no.= "+ n1);
        }
        
        if (n2> n1 && n2>n3)
        {
            System.out.println("max no.= "+ n2);
        }
        
        
        if (n3> n1 && n3>n2)
        {
            System.out.println("max no.= "+ n3);
        }
    }
}
