/*9.WAP to input any character and check whether it is alphabet, digit or special character.*/
import java.util.*;
class Alphordigit
{
  //main method
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Character :");
        char ch=sc.next().charAt(0);
      //read ascii values and using else if condition 
        if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z')
        {
            System.out.println("Alphabet is:"+ch);
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("Digit is:"+ch);
        }
        else
        {
          //print result
            System.out.println("Special Character is :"+ch);
            
        }
    }
}