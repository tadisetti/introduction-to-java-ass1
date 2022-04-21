/* WAP to input electricity unit charges and calculate total     electricity bill according to the given condition:
    For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
import java.util.*;
class Electricitybill
{
    public static void main(String args[])
    { 
        int units;
        double billtopay=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Units For Calculating Electricity bill:");
        units=sc.nextlnt();
        if(units<50)
        {
            billtopay=units*0.50;
            
        }
        else if(units<=150)
        {
         billtopay=(50*0.50)+((units-100)*0.75);   
        }
        else if(units<250)
        {
        billtopay=(50*0.50)+(50*0.75)+((units-150)*1.20);
        }
        else
        {
            billtopay=(50*0.50)+(50*0.75)*((units-200)*1.50);
            
        }
        System.out.println("The Electricity Bill For "+units+" is:"+billtopay);
    }
}