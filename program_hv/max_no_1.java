package program_hv;
import java.util.Scanner;
public class max_no_1
{
    public static void main ()
    {
        System.out.println("\f");
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number 1");
        double n1= sc.nextDouble ();
        System.out.println("Enter number 2");
        double n2= sc.nextDouble ();
        if (n1>n2)
        
            System.out.println(n1+" is greater than " +n2);
        else if(n2>n1)
        
        System.out.println(n1+" is smaller than " +n2);
        else 
        System.out.println(n2+" is equal to " +n1);
    }
}
