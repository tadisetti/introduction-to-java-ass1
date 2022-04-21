/*WAP to check whether a number is divisible by 5 and 11 or not.*/
import java.util.*;
class Divisible5or11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number To Check It is Divisble By 5 and 11:");
        int number=sc.nextInt();
        if(number%5==0 && number%11==0)
        {
            System.out.println("Given Number "+number+" is Divisble By 5 and 11");
        }
        else
        {
            System.out.println("Given Number "+number+" is Not Divisble By 5 and 11");
        }
    }
}