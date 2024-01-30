import java.util.Scanner;

public class Gross_salary
{
   public static void main ()
   {
       
       Scanner sc= new Scanner (System.in);
       double bs= sc.nextDouble();
       double har=0,da=0;
       if  (bs <= 10000 )
       {
           har= 0.2 ;
           da=0.8;
        }
       else if (bs<= 20000 && bs>10000)
       {   har= 0.25;
           da = 0.9;
        }
        else if (bs>20000)
        {
           har= 0.3;
           da = 0.95;
        }
        
       System.out.println("Basic salary = Rs."+ bs);
       System.out.println("HRA = Rs."+ har * 100);
       System.out.println("DA = Rs."+ da * 100);
       System.out.println("HRA amount  = Rs."+har * bs);
       System.out.println("DA amount = Rs."+ da * bs);
       System.out.println("Gross salary = Rs."+ bs*(1+har+da ) );
         
         
   }
}
