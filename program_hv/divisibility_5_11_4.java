package program_hv;


import java.util.Scanner;
public class divisibility_5_11_4
{
  public static void main ()
  {
    System.out.println("\f");  
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the number for checking divisibility of 5 and 11:"); 
    double n= sc.nextDouble();
    if (n%55==0)
     System.out.println(n+" is divisible by both 5 and 11");
     else if (n%5==0 && n%11!=0)
     System.out.println(n+" is only divisible by 5 and not by 11");
     else if(n%5!=0 && n%11==0)
     System.out.println(n+" is only divisible by 11 and not by 5");
    else
     
    System.out.println(n+" is neither divisible by 5 nor 11");
  }
}
