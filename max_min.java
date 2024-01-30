import java.util.Scanner;
public class max_min 
{
    public static void main()
   {
        System.out.println("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of times you want to check the maximum and minimum number ");
        int l=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=1;i<=l;i++)
        {
            System.out.print("Enter the number ");
            int n=sc.nextInt();
            if(n>max)
             max=n;
            else if(n<min)
             min=n;
            }
        System.out.println("The maximum number among the all is "+max);
        System.out.println("The minimum number among the all is "+min);
  }                                                                                                                                
}