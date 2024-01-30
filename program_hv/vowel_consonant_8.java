package program_hv;

 import java.util.Scanner;
public class vowel_consonant_8
{
    public static void main ()
    {
        System.out.println("\f");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter character");
        String ch= sc.next();
        int l=ch.length();        
        if ((ch== "a"||ch== "A")&& l==1)
        System.out.println(ch +" is vowel");
        else if ((ch== "b"||ch== "B")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "c"||ch== "C")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "d"||ch== "D")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "e"||ch== "E")&& l==1)
        System.out.println(ch +" is vowel");
        else if ((ch== "f"||ch== "F")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "g"||ch== "G")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "h"||ch== "H")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "i"||ch== "I")&& l==1)
        System.out.println(ch +" is vowel");
        else if ((ch== "j"||ch== "J")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "k"||ch== "K")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "l"||ch== "L")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "m"||ch== "M")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "n"||ch== "N")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "o"||ch== "O")&& l==1)
        System.out.println(ch +" is vowel");
        else if ((ch== "p"||ch== "P")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "q"||ch== "Q")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "r"||ch== "R")&& l==1)      
        System.out.println(ch +" is consonant");
        else if ((ch== "s"||ch== "S")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "t"||ch== "T")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "u"||ch== "U")&& l==1)
        System.out.println(ch +" is vowel");
        else if ((ch== "v"||ch== "V")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "w"||ch== "W")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "x"||ch== "X")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "y"||ch== "Y")&& l==1)
        System.out.println(ch +" is consonant");
        else if ((ch== "z"||ch== "Z")&& l==1)
        System.out.println(ch +" is consonant");
        else if (l>1)
        {System.out.println(ch +" is a word");
        System.out.println("Type single letter");
        }
        else
        System.out.println(ch +" is not alphabet");
    }
}
