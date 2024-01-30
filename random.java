
import java.util.Random;
import java.util.Scanner;
public class random
{
    public static void main ()
    {
       Scanner sc= new Scanner (System.in);
       System.out.println("Enter limit");
       int n= sc.nextInt();
       // imp to generate random no.{
       int number;
       Random r= new Random();
       number= r.nextInt(n+1);
       System.out.println("no.="+ number);
       // }imp
  }
}
