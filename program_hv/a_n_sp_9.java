package program_hv;


import java.util.Scanner;
public class a_n_sp_9
{
    public static void main ()
    {
        System.out.println("\f"); 
        Scanner sc= new Scanner (System.in);
           
        System.out.println("Enter the character");
        String s= sc.next();
        
        char ch = s.charAt(0);  
        int i=Integer.parseInt(s);
        if (ch==0|| ch==1|| ch==2|| ch==3|| ch==4|| ch==5|| ch==6|| ch==7|| ch==8|| ch==9)
        System.out.println(s+" is a number");
        
    
    }
}
