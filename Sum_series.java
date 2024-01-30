import java.util.Scanner;
public class Sum_series
{
    public static void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("\f");
       System.out.println("Enter number");
       int c=sc.nextInt();
       System.out.println("Enter limit");
       int l=sc.nextInt();
       switch (c)
       {
           case 1:
               {
                   for (int i=1,j=1;i<=l;i=i+2,j++)
                  {
                      if (j%2==0)
                        System.out.print("-"+i+",");
                      else
                        System.out.print(i+",");
                  }
                   break;
               }
           case 2:
               {
                   int n1=0;
                   for (int i=1;i<=l;i++)
                   {
                       n1=n1*10+1;
                       System.out.print(n1+",");
                   }
                   break;
               }
           case 3:
               {
                   int sum=0;
                   for (int i=2,j=1;i<=l;i=i+2,j++)
                  {
                      if (j%2==0)
                        sum=sum-i;
                      else
                        sum=sum+i;
                  }
                  System.out.println("Your sum upto "+l+" = "+sum);
                   break;
               }
            case 4:
                {
                    int sum=0;
                    System.out.println("Enter your number to be added.");
                    int num=sc.nextInt();
                    for (int i=1;i<=l;i++)
                   
                        sum=sum+(num+i);
                    System.out.println("Sum= "+sum);
                   break;
                }
            case 5:
                {
                    double sum=0;
                    System.out.println("Enter your number to be divided.");
                    double num=sc.nextDouble();
                    for (int i=2;i<=l;i=i+3)
                   
                        sum=sum+(num/i);
                    System.out.println("Your sum  = "+sum);
                   break;
                }
            case 6:
                {
                    double sum=0;
                    System.out.println("Enter your number to divide.");
                    double num=sc.nextDouble();
                    for (int i=1;i<=l;i++)
                   
                        sum=sum+(i/Math.pow(num,i));
                    System.out.println("Your sum  = "+sum);
                   break;
                }
       }
}
}
