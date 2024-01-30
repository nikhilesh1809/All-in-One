package program_hv;


import java.util.Scanner;
public class Salary_27
{
    public static void main()
    {
        System.out.println("\f");
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your details");
        System.out.println("Gender:");
        String g=sc.next();
        System.out.println("Year of Service:");
        int ys=sc.nextInt();
        System.out.println("Qualification (Post Graduate/Graduate):");
        String q=sc.next();
        int s=0;
        if ((g=="male"||g=="Male"||g=="m"|| g=="M")&&ys>=10)
        {
            if (q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=15000;
            else if(q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=10000;
        }
        else if ((g=="male"||g=="Male"||g=="m"|| g=="M")&& ys<10)
        {
            if (q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=10000;
            else if(q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=7000;
        }
        else if ((g=="female"||g=="Female"||g=="f"|| g=="F")&&ys>=10)
        {
            if (q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=12000;
            else if(q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=9000;
        }
        else if ((g=="female"||g=="Female"||g=="F"|| g=="f")&& ys<10)
        {
            if (q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=10000;
            else if(q=="Post Graduate"||q=="post graduate"|| q== "Post graduate")
            s=6000;
        }
        
        System.out.println("Salary="+s);
    }
}
