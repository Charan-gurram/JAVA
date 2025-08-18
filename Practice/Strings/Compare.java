import java.util.Scanner;
public class Compare {
    public String compstr()
    {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1=sc.next();
        System.out.println("Enter string 2");
        String str2=sc.next();
        sc.close();
        if(str1.equalsIgnoreCase(str2))     return "Both strings are same";
        return "not same";

    }
    public static void main(String[] args) {
        Compare co=new Compare();
        System.out.println(co.compstr());
      }
}
