import java.util.*;
class AlphorNot
{
  //main method
  public static void main(String args[])
  {
    //declear a variable and initialized
    char letter;
      Scanner sc=new Scanner(System.in);
    char char1=sc.next().charAt(0);
    //using else if condition
    if((char1=='a')||(char1=='e')||(char1=='i')||(char1=='o')||(char1=='u')||(char1=='A')||(char1=='E')||(char1=='I')||(char1=='O')||(char1=='U'))
    {
      System.out.println("The character is a vowel");
    }
    else
    {
      //print result
      System.out.println("The character is a constants ");
    }
  }
}