import java.util.Scanner;
public class CharCount 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int freq[]=new int[256];
        for(char ch:str.toCharArray())
        {
            freq[ch]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
                System.out.println("ASCI VALUE: "+i+" "+"CHARACTER: "+(char)i+" count: "+freq[i]);
            }
            
        }
}
}