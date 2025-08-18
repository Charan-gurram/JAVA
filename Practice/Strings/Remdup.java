import java.util.Scanner;
public class Remdup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.next();
        sc.close();
        String remdup="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(remdup.indexOf(ch)==-1)
               remdup+=ch;
        }
        System.out.println("String after duplicated characters : "+remdup);
    }
}
