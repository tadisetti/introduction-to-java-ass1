//5.WAP to check whether a number is even or odd.
import java.util.*;
class EvenorOdd
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter An Integer Number");
        num=sc.nextInt();
        
        if (num%2==0)
        {
            System.out.println("Enter Number is Even:");
        }
        else
        {
            System.out.println("Enter Number is Odd:");
        }
        
    
        
    }
}