 import java.util.Scanner;
 class Controlflow
 {
   // 1. Age Category Calcuator

    public static String agecal()
    {
        System.out.println("Enter age below 100 only");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<13) return "child";
        else if(age>=13&&age<=19) return "Teenager";
        else if(age>=20&&age<=59) return "Adult";
        return "Senior citizen";
    }

   //2. Powerbill calculator

    public static int powerbill()
    {
        System.out.println("Enter Units");
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        if(units<=100) return (units*5);
        else if(units>100&&units<=300) return (((units-100)*7)+(100*5));
        return (((100*5)+(200*7)+(units-300)*10));

    }

    // 3. Even or odd
    public static String evod()
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0) return "even";
        else return "odd";
    }
     
    //4. Sum of first N natural numbers

    public static int sofn()
    {
        System.out.println("Enter number of values up to be added");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum+=i;
        }
        return sum;
    }
    
    // 5 . Factorial 

    public static int factorial()
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact*=i;
        }
        return fact
    }

    //6. reverse a digits
    public static int revdig()
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,rev=0;
        while (num!=0) 
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }

    //7.maximum of three numbers
        public static int threeNum()
        {
            System.out.println("Enter three numbers seperated by space");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a>b&&a>c) return a;
            else if (b>a&&b>c) return b;
            return c;
        }

   //8. Even numbers from 1 to 50
     public static void even()
     {
        for(int i=0;i<=50;i+=2)
        {
            if(i%2==0)
            {
                System.out.print(i);
            }
        }
     }
   // 9.Loan elgibilty checker
        public static String loanElgibilty()
        {
            System.out.println("Enter income &age ");
            Scanner sc=new Scanner(System.in);
            int inc=sc.nextInt();
            int age=sc.nextInt();
            if(inc>=30000&&age>=21) return "Elgible";
            return "not elgible";
        } 
       // 10. Multiplication table generator

        public static void multi()
        {
            System.out.println("Enter a number");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            for(int i=0;i<=10;i++)
            {
                System.out.println(num + "X" + i + "="+(num*i));
            }
        }

    public static void main(String[] args) 
        {
             
                 System.out.println(agecal());
                 System.out.println(powerbill());
                 System.out.println(evod());
                  System.out.println(sofn());
                 System.out.println(revdig());
                 System.out.println(threeNum());
                 even();
                 System.out.println(loanElgibilty());
                 multi();
        }
}