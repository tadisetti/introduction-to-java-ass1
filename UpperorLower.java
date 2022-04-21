/*10.WAP to check whether a character is uppercase or lowercase     alphabet.*/
import java.util.*;
class UpperorLower
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Character :");
        char ch=sc.next().char At(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println("Upper Case Letter is:"+ch);
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("Lower Case Letter is:"+ch);
        }
        else
        {
            System.out.println("Not Alphabet is :"+ch);
            
        }
    }
}