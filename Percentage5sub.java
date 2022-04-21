/*WAP to input marks of five subjects Physics, Chemistry, Biology,Mathematics and Computer. Calculate percentage and grade according to following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
import java.util.*;
class Percentage5sub
{
    public static void main(String args[])
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Marks Of Five Subjects:\n");
    float physics=sc.nextFloat();
    float chemistry=sc.nextFloat();
    float biology=sc.nextFloat();
    float mathematics=sc.nextFloat();
    float computer=sc.nextFloat();
    
    float total;
    float average;
    float percentage;
    char grade;
    total=physics+chemistry+biology+mathematics+computer;
    average=(float)(total/5.0);
    percentage=(float)(total/500.0)*100);
    if (average>=90)
    
    grade='A';
    else if(average>=80 && average<90);
    grade='B';
    else if(average>=70 && average<80);
    grade='C';
    else if(average>=60 && average<70);
    grade='D';
    else if(average>=40 && average<50);
    grade='E';
    else 
    grade='F';
    System.out.println("\n The Total Marks="+total+"/500.0");
    System.out.println("The Average Marks= "+average+);
    System.out.println("The Percentage ="+ Percentage+ "%");
    System.out.println("The grade ="+grade+"");
}
    
}