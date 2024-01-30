import java.util.Scanner;
public class pronic_number
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("\f");
        System.out.println("Enter number");
       int n=sc.nextInt();
       boolean flag = false;
        for (int i = 1; i <= n/2; i++)
        {
            if (i * (i + 1) == n)
            {
                flag = true;
                break;
            }
        }
       
        if (flag==true)
            System.out.println(n + " is a pronic number");
        else
            System.out.println(n + " is not a pronic number");
    }
}