
import java.util.Scanner;
public class Quiz_ts_1_fix
{
    public static void main()
    {
        System.out.println("\f");
        Scanner sc= new Scanner (System.in);
        System.out.println("Teacher will type question with answer then student will sove it");
        int p=0;
        System.out.println("Question 1:");
        String q1=sc.next ();
        System.out.println("Answer 1:");
        String ta1= sc.next ();
        
        
        System.out.println("Question 2:");

        String q2=sc.next ();

        System.out.println("Answer 2:");

        String ta2= sc.next ();

        

        System.out.println("Question 3:");

        String q3=sc.next();

        System.out.println("Answer 3:");

        String ta3= sc.next ();

        

        System.out.println("Question 4:");

        String q4=sc.next ();

        System.out.println("Answer 4:");

        String ta4= sc.next ();

        

        System.out.println("Question 5:");

        String q5=sc.next ();

        System.out.println("Answer 5:");

        String ta5=sc.next ();

        

        System.out.println("Question 6:");

        String q6=sc.next ();

        System.out.println("Answer 6:");

        String ta6=sc.next ();

        

        System.out.println("Question 7:");

        String q7=sc.next ();

        System.out.println("Answer 7:");

        String ta7= sc.next ();

        

        System.out.println("Question 8:");

        String q8=sc.next ();

        System.out.println("Answer 8:");

        String ta8= sc.next ();

        

        System.out.println("Question 9:");

        String q9=sc.next ();

        System.out.println("Answer 9:");

        String ta9= sc.next ();

        

        System.out.println("Question 10:");

        String q10=sc.next ();

        System.out.println("Answer 10:");

        String ta10= sc.next ();

        

        System.out.println("\f");

        

        System.out.println ("Q1. "+q1);

        String sa1= sc.next ();

        

        System.out.println ("Q2. "+q2);

        String sa2= sc.next ();

        

        System.out.println ("Q3.  "+q3);

        String sa3= sc.next ();

        

        System.out.println ("Q4. "+q4);

        String  sa4= sc.next ();

        

        System.out.println ("Q5. "+q5);

        String sa5= sc.next ();

        

        System.out.println ("Q6. "+q6);

        String sa6= sc.next ();

        

        System.out.println ("Q7. "+q7);

        String sa7= sc.next ();

        

        System.out.println ("Q8. "+q8);

        String sa8= sc.next ();

        

        System.out.println ("Q9. "+q9);

        String sa9= sc.next ();

        

        System.out.println ("Q10. "+q10);

        String sa10= sc.next ();

        

        if (ta1.equals(sa1))

        {

            p++;

            System.out.println("Question 1: correct");

        }

        else

        {

            System.out.println("Question 1: wrong");

        }

        

        

        if (ta2.equals(sa2))

        {

            p++;

            System.out.println("Question 2: correct");

        }

        else

        {

            System.out.println("Question 2: wrong");

        }

        

        

        if (ta3.equals(sa3))

        {

            p++;

            System.out.println("Question 3: correct");

        }

        else

        {

            System.out.println("Question 3: wrong");

        }

        

        

        if (ta4.equals(sa4))

        {

            p++;

            System.out.println("Question 4: correct");

        }

        else

        {

            System.out.println("Question 4: wrong");

        }

        

        

        if (ta5.equals(sa5))

        {

            p++;

            System.out.println("Question 5: correct");

        }

        else

        {

            System.out.println("Question 5: wrong");

        }

        

        

        if (ta6.equals(sa6))

        {

            p++;

            System.out.println("Question 6: correct");

        }

        else

        {

            System.out.println("Question 6: wrong");

        }

        

        

        if (ta7.equals(sa7))

        {

            p++;

            System.out.println("Question 7: correct");

        }

        else

        {

            System.out.println("Question 7: wrong");

        }

        

        

        if (ta8.equals(sa8))

        {

            p++;

            System.out.println("Question 8: correct");

        }

        else

        {

            System.out.println("Question 8: wrong");

        }

        

        

        if (ta9.equals(sa9))

        {

            p++;

            System.out.println("Question 9: correct");

        }

        else

        {

            System.out.println("Question 9: wrong");

        }

        

        if (ta10.equals(sa10))

        {

            p++;

            System.out.println("Question 10: correct");

        }

        else

        {

            System.out.println("Question 10: wrong");

        }

        

        System.out.println ("Your Score="+p);

        

        System.out. println ("Solutions:");

        System.out. println ("Question 1:"+ta1);

        System.out. println ("Question 2:"+ta2);

        System.out. println ("Question 3:"+ta3);

        System.out. println ("Question 4:"+ta4);

        System.out. println ("Question 5:"+ta5);

        System.out. println ("Question 6:"+ta6);

        System.out. println ("Question 7:"+ta7);

        System.out. println ("Question 8:"+ta8);

        System.out. println ("Question 9:"+ta9);

        System.out. println ("Question 10:"+ta10);

        

        System.out.println("Keep playing");        

        

    }

}