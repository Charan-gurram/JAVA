
import java.util.Scanner;
public class Palindrome2 
{
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("ENter a string");
            String inp=sc.nextLine();
            sc.close();
            boolean palin=true;
            int n=inp.length();
            for(int i=0;i<n/2;i++)
            {
                if(inp.charAt(i)!=inp.charAt(n-i-1))
                {
                        palin=false;
                        break;
                }
            }
        System.out.println(palin);
     }   
}
