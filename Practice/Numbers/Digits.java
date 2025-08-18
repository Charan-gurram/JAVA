import java.math.*;
public class Digits {
    // counting digits 
    void DigCount()
    {
        long num=20178908123457L;
        int c=0,rem;
        while (num>0) 
        {
            c++;
            rem=(int)num%10;
            num=num/10;
        }
        System.out.println("Digits count : "+c);
    }

    // Reversing a number

    void reveresnum()
    {
        int num= 56723,rem,rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
         
        }
          System.out.println("Reversed number : " +rev);

    }

    // Palindrome number 

    void palindrome()
    {
        int num= 56723,rem,rev=0,n=num;
        while(num!=0)
        {

            rem=num%10;
            rev=rev*10+rem;
            num/=10;
         
        }
        if(n==num) System.out.println(n+" : is a palindorme");
        else System.out.println(n+ " : is not a palindrome");
    }

    // Sum of digits

    void digitsum()
    {
        int num=12345,rem,sum=0;
        while(num!=0)
        {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of digits is : "+sum);

    }

    //Armstrong number 

    void Armstrong()
    {
        int num=153,n=num,sum=0,rem;
        int digits=String.valueOf(num).length();
        while(num!=0)
        {
            rem=num%10;
            sum+=Math.pow(rem, digits);
            num/=10;
        }
        if(n==sum) System.out.println(n+" is a armstrong number");
        else  System.out.println(n+" is not an armstrong number");
    }

    //Fibonaci
    void fibanoci()
    {
             int fnum=
    }
    public static void main(String[] args) {
       Digits dg=new Digits();
       dg.DigCount();
       dg.reveresnum();
       dg.palindrome();
       dg.digitsum();
       dg.Armstrong();
    }
}
