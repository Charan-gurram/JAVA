public class LongestWord {
    public static void main(String[] args) {
        String s1="Hello Achievers It";
        String s2=" ";
        String[] words=s1.split(" ");
        for(String wor:words)
        {
            if(wor.length()>s2.length())
            {
                s2=wor;
            }   
        }
        System.out.println(s2);
    }
    
}
