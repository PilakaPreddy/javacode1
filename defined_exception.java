//user defined exception
package prcode;
import java.util.*;
class CheckAge extends Exception
{
 CheckAge(String str)
 {
   super(str);
  //System.out.println(str);
 }
}

public class defined_exception {
  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter Age of the person: ");
    int age;
    age=sc.nextInt();
    try
    {
    if (age<18)
       throw new CheckAge("Not a valid age to vote");
    else
      System.out.println("Valid age to vote");
    }
    catch (CheckAge c) 
    {
      System.out.println("This is in catch block");
      System.out.println(c);
      System.out.println(c.getMessage());

      
    }
    System.out.println("Using user defined exceptions");
    sc.close();
  }
}	