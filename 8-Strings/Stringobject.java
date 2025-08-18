public class Stringobject
 {
    public void compare()
    {
        String s=new String("Hello");
        System.out.println(s);
        String s1=new String("Hello");
        String s2=new String("Hello");
        //In string object == compares values and reference variables
        System.out.println(s1==s2);
        //In string object .equals compares value only
            System.out.println(s1.equals(s2));
    }
    public static void main(String[] args) 
    {
       
        Stringobject obj=new Stringobject();
        obj.compare();
    }
}
