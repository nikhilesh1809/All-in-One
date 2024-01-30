
import java.util.Scanner;
public class question
{
    public static void main ()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Question");
        String q=sc.nextLine();
        System.out.println ("\f");
        if (q.equals("hii"))
        {
           System.out.println("Hello"); 
        }
        else if (q.equals("what is your name"))
        {
           System.out.println("my name is ba"); 
        }
    }
}
