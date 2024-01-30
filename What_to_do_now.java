
import java.util.*;
public class What_to_do_now
{
    public static void main ()
    {
        System.out.println("\f");
        Scanner sc=new Scanner (System.in);
        System.out.println("No.of topics");
        int ns= sc.nextInt();
        Random rand = new Random();
        int rn = rand.nextInt(3) + 1;
        if (ns==2)
         {
          System.out.println("Subject 1:");
          String n1= sc.next();
          System.out.println("Subject 2:");
          String n2= sc.next();
          System.out.println("\f");
          if( rn==1) 
         System.out.println(n1);
          else if( rn==2) 
         System.out.println(n2);
         }
         
        if (ns==3)
         {
          System.out.println("Subject 1:");
          String n1= sc.next();
          System.out.println("Subject 2:");
          String n2= sc.next();
          System.out.println("Subject 3:");
          String n3= sc.next();
          System.out.println("\f");
          if( rn==1) 
         System.out.println(n1);
          else if( rn==2) 
         System.out.println(n2);
         else if( rn==3) 
         System.out.println(n3);
         }
         
        
      if (ns==4)
         {
          System.out.println("Subject 1:");
          String n1= sc.next();
          System.out.println("Subject 2:");
          String n2= sc.next();
          System.out.println("Subject 3:");
          String n3= sc.next();
          System.out.println("Subject 4:");
          String n4= sc.next();
          System.out.println("\f");
          if( rn==1) 
         System.out.println(n1);
          else if( rn==2) 
         System.out.println(n2);
         else if( rn==3) 
         System.out.println(n3);
         else if( rn==4) 
         System.out.println(n4);
         }
         
         
        
    }
}
