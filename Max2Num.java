//WAP to find maximum between two numbers.
import java.util.*;
class Max2Num
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number Values");
        num1=sc.nextInt();
        System.out.println("Enter Second Number Values");
        num2=sc.nextInt();
        if (num1>num2)
        {
            System.out.println("Number One  is Maximum:");
        }
        else
        {
            System.out.println("Number Two  is Maximum:");
        }
    }
}