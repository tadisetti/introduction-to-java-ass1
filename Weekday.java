//11.WAP to input week number and print week day.
import java.util.*;
class Weekday
{
    public static void main(String args[])
    {
        int n;
       
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        n=sc.nextInt();
      
       
        if(n==1)
        {
            System.out.println("sunday");
        }
        else if(n==2)
        {
             System.out.println("monday");
        }
        else
        {
            System.out.println("saturday");
        }
       
    }
}