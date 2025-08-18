public class Palindrome
{
    public static void main(String[] args)
     {
        String s="Hello";
        String rev="";
        String s2=s;
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        System.out.println(rev);
        if(s2.equals(rev))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}