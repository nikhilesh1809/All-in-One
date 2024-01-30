import java.util.Scanner;
public class table
{
    public static void main ()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println ("Enter multiplication table no.");
        int t= sc.nextInt();
        System.out.println ("Enter limit of table ");
        int l= sc.nextInt();
        
        for (int i=1;i<=l;i++)
        {
            System.out.println(t+" X "+i+" = "+t*i );
        }
    
    }
}
