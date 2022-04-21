//WAP to count total number of notes in given amount.
import java.util.*;
class NotesCount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextlnt();
        int notes=0;
        int denom=0;
        
        if(n>=2000)
        {
            notes=n/2000;
            denom=n%2000;
            
        }
        if(denom>=500)
        {
            notes=notes+(denom/500);
            denom=denom%500;
        }
        if(denom>=200)
        {
            notes=notes+(denom/200);
            denom=denom%200;
            
        }
        if(denom>=100)
        {
            notes=notes+(denom/100);
            denom=denom%100;
            
        }
        System.out.println("notes");
    }
}