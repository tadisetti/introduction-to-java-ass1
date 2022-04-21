/*WAP to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
import java.util.*;
class Employeesal
{
    public static void main(String args[])
    {
        float   basic_ salary,DA,HRA, Gross Salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary Of Employee:");
        Basic_Salary=sc.nextFloat();
        System.out.println("Enter Basic DA Of Employee:");
        da1=sc.nextFloat();
        System.out.println("Enter Basic HRA Of Employee:");
        hra1=sc.nextFloat();
        Gross Payment=Basic_Salary+DA+HRA;
        System.out.println("Gross Salary Of Employee"+Gross Salary);
        
    }
}