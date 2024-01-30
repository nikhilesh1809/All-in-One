


import java.util.Scanner;
public class Quiz_ts1
{
    public static void main()
    {
        System.out.println("\f");
        Scanner sc= new Scanner (System.in);
        Scanner s= new Scanner (System.in);        
        System.out.println("Teacher will type question with answer then student will sove it");
        int p=0;
        System.out.println("Question 1:");
        String q1=sc.nextLine();
        System.out.println("Answer 1:");
        String ta1= sc.nextLine();
        
        System.out.println("Question 2:");
        String q2=sc.nextLine();
        System.out.println("Answer 2:");
        String ta2= sc.nextLine();

        
        System.out.println ("Q1."+q1);
        String sa1= sc.nextLine();
        if (ta1.equals(sa1))
        {
            p++;
            System.out.println("Question 1: correct");
        }
        else
        {
            System.out.println("Question 1: wrong");
        }
        
        
        System.out.println ("Q1."+q2);
        String sa2= sc.nextLine();
        if (ta2.equals(sa2))
        {
            p++;
            System.out.println("Question 2: correct");
        }
        else
        {
            System.out.println("Question 2: wrong");
        }
        
        
        System.out. println ("Question 1:"+ta1);

     }
}
