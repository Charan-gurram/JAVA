public class Hyphens 
{
 public static void main(String[] args) {
    String s="Hello world java";
    String res="";
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==' ')
        {
            res=s.replace(' ', '-');
        }
    }
    System.out.println(res);
 }   
}
