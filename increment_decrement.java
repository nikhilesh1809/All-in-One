import java.util.Scanner;
public class increment_decrement
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter 1 or 2");
        System.out.println("1-increment");
        System.out.println("2-decrement");
        int c= sc.nextInt();
        System.out.println("Enter starting");
        int s= sc.nextInt();
        System.out.println("Enter ending");
        int e= sc.nextInt();

        if (c==1)
        {
            if (e>s)
            {
                // System.out.println("increment series:");
                for (int i=s;i<=e;i++)
                System.out.println(i+",");
            }
            else 
            System.out.println("Wrong input pls check again !!");
        }
        
        else if (c==2)
        {
            if (s>e)
            {
               for (int i=s;i<=e;i--)
            {
               System.out.println(i+",");
            }
            }
            else 
            System.out.println("Wrong input pls check again !!");
        }
        
        
    }
}
