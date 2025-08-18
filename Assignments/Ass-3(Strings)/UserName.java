import java.util.*;
public class UserName
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter email");
       String email=sc.nextLine();
       int ind=email.indexOf('@');
       String name=email.substring(0,ind);
       System.out.println(name); 
    }
}