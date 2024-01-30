
import java.util.Scanner;
public class quadratic_eqn
{
    public static void main()
    {
      Scanner sc= new Scanner (System.in);
      Scanner SC = new Scanner (System.in) ;
      System.out.println ("Enter coef frient of x^2");
      double a = sc.nextDouble(); 
      System.out.println ("Enter coefficient of x") ;
      double b=sc.nextDouble ();
      System.out.println("Enter constant");
      double c = sc.nextDouble();
      double r1=  ((-b + Math.sqrt(b*b-4*a*c))/2*a); 
      double r2=((-b- Math.sqrt (b*b-4 *a*c)) /2*a); 
      System.out.println ("Roots of Quadratic Equation " + r1+","+r2);
      System.out.println ("Quadratic Equation:" +a + " x^2 +" + b + "x +" + c + "= 0") ;
              
              
              
      
    }
    }

