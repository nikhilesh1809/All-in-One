import java.util.Scanner;
public class series
{
    public static void main ()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter no.");
        int c=sc.nextInt();
        System.out.println("Enter limit");
        int l=sc.nextInt();
        double sum=0;        
        
        
        switch (c)
        {
            case 1:
                {
                    for (int i=1,j=1;i<=l;i++,j=j+2)
                    {
                        if (i%2==0)
                        System.out.println(-j+ ",");
                        else 
                        System.out.println(j+ ",");
                    }
                    
                }
                
            case 2:
                {
                  for (int i=1;i<=l;i++)
                    {
                        sum=sum+(i*i);
                    }  
                }
            
            case 3:
                {
                   System.out.println("Enter power");
                   int a=sc.nextInt(); 
                  for (int i=1;i<=l;i++)
                    {
                        sum=sum+Math.pow(i,a);
                    }  
                }
            
            case 4:
                {
                  for (int i=2;i<=l;i++)
                    {
                        sum=sum+(i/Math.pow(i-1,i-1));
                    }  
                }
            
            case 5:
                {
                  for (int i=1;i<=l+1;i++)
                    {
                        sum=sum+(i*i)-1;
                    }  
                }
                
        }
        System.out.println("Sum="+ sum);
    }
}
