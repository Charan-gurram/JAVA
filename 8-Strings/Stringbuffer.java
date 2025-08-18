public class Stringbuffer
 {
    public void compare()
    {
        StringBuffer s1=new StringBuffer("Gurram");
        StringBuffer s2=new StringBuffer("Gurram");
    //  in string buffer both " == " and ".equals" returns only false as when the string is changed its point to same reference
        System.out.println(s1==s2);                 
        System.out.println(s1.equals(s2));
    }
    public static void main(String[] args) 
    {
        StringBuffer str=new StringBuffer("hello world");
        System.out.println(str);
        Stringbuffer sb=new Stringbuffer();
        sb.compare();

        
    }
    

}
