public class CapsSmall {
    public static void main(String[] args) {
        String s="aBaCdDeFf";
        String caps="";
        String Small="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                Small+=ch;
            }
            else
            caps+=ch;
        }
        System.out.println(Small);
        System.out.println(caps);
    }
    
}
