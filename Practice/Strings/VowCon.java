import java.util.*;
public class VowCon
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String inp=sc.nextLine();
        sc.close();
        int v=0,c=0;
        inp=inp.toLowerCase();   
        for(char ch:inp.toCharArray())
     {
         if("aeiou".indexOf(ch)!=-1)
            v++;
         else 
          c++;
     }
     System.out.println("Vowels count: " +v+ " "+"Consonants count : "+c);
    }
}
