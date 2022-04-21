//WAP to find maximum between three numbers.
import java.util.*;
class Max3Num
{
    public static void main(String args[])
    {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Three Number");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if (num1>num2 && num1>num3)
        {
            System.out.println("The Maximum Number is:"+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("The Maximum Number is:"+num2);
        }
        else if (num3>num1 && num3>num2)
        {
            System.out.println("The Maximum Number is:"+num3);
        }
        else
            System.out.println("The Number Are Same");
        
    }
    
}

