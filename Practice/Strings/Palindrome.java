import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String inp=sc.nextLine();
        sc.close();
        String rev="";
        String inp1=inp;
        for(int i=inp.length()-1;i>=0;i--)
        {
           System.out.println( rev+=inp.charAt(i));
        }
        System.out.println("reversed:"+rev);
        System.out.println(inp1);
        if(rev.equals(inp1))
        {
            System.out.println("palindorme");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}
