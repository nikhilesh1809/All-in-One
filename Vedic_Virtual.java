import lang.stride.*;
import java.util.Scanner;

/**
 * 
 */
public class Vedic_Virtual
{

    /**
     * 
     */
    static public void main()
    {
        System.out.println("\f");
        Scanner sc =  new  Scanner(System.in);
        System.out.println("Welcome to Vedic Virtual");
        System.out.println("Type a random no. between 1 to 10");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Take any three digit number in your mind.");
            System.out.println("Reverse the number.");
            System.out.println("Take the difference between number and number after reversing digits.");
            System.out.println("After taking difference type unit digit of difference:");
            int o1 = sc.nextInt();
            System.out.println("Difference between number and it's digit after reversing digit is=" + (o1 + 90 + (9 - o1) * 100));
            System.out.println("Difference =" + (o1 + 90 + (9 - o1) * 100));
        }
        else if (n == 2) {
            System.out.println("Choose a number between 1 to 10");
            System.out.println("Multiply number by 16");
            System.out.println("Add 144 to the answer");
            System.out.println("Divide the answer by 8");
            System.out.println("Type what is your final answer");
            int f2 = sc.nextInt();
            System.out.println("The number that you choose in start was: " + (f2 - 18) / 2);
        }
    }
}
