import java.util.Scanner;

public class Prime_number
{
    public static void main ()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter number");
        int n=sc.nextInt();
        boolean flag= false;
        if (n==1)
         System.out.println ("1 is neither prime nor composite");
        else if (n==0)
         System.out.println ("0 is composite");
         else 
         {
             for (int i=2;i < n/2;i++)
             {
                 if (n%i==0)
                 {
                     flag= true;
                     break;
                 }
                 
                 
             }
             
             if (flag)
             
                 System.out.println (n+" is composite number ");
                 else 
                 System.out.println (n+" is prime number ");
                 
             
         }
    
        
    }
}
