import java.util.*;
class Revstr
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String inp=sc.nextLine();
    sc.close();
    System.out.println("Entered String is : "+inp);
    String rev="";
    for(int i=inp.length()-1;i>=0;i--)
    {
        rev+=inp.charAt(i);
    }
    System.out.println("Reversed String is : "+rev);
 }
}