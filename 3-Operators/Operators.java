class Operators
{
    static int a=20;
    static int b=10;
    int c=14;
    public static void main(String[] args)
     {
    //arthimetic operators
    //[+,-,*,/,%]
     System.out.println("Arthimetic Operators");
    int add=a+b;
    System.out.println(add);
    int sub=a-b;
    System.out.println(sub);
    int mul=a*b;
    System.out.println(mul);
    int div=a/b;
    System.out.println(div);
    int modu=a%b;
    System.out.println(modu);
    //[Assignment Operators]
    //[=,+=,-=,*=,/=,%=]

      Operators o=new Operators();
       System.out.println("Assignment Operators");
      System.out.println(o.c=2);
      System.out.println(o.c+=2);
      System.out.println(o.c-=2);
      System.out.println(o.c*=2);
      System.out.println(o.c/=2);
      System.out.println(o.c%=2);

      //conditional or comparision Operators
      //[>,<,>=,<=,==,!=]
        System.out.println("Conditional Operators");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //Logical operators
        //[&&,||,!]
            System.out.println(a>b&&a>o.c);
            System.out.println(a>b||a>o.c);
            System.out.println(!(a>b));

        //Bitwise Operators
        //[&,|,^,<<,>>]
        System.out.println("Bitwise Operators");
        System.out.println(a&b);//{ 1&1 - true , 0&0 = false , 0&1 = false , 1&0 = false }
        /*
            a=20=10100
            b=30=11110
            ------------
                 0110010=50
         */
        System.out.println(a|b);//{ 1&1 - true , 0&0 = false , 0&1 = true , 1&0 = true }
        /*
            a=20=10100
            b=30=11110
            ------------
                -01010=-10
         */
        System.out.println(a^b);//{ 1^1 = 0 , 0^0 = 0 , 0^1 = 1 , 1^0 = 1 }
                 System.out.println(5>> 1);  // 5 >> 1 = 2
        // Explanation
        // 5 in binary:  0 1 0 1
        // Shift right:  0 0 1 0  => 2 (each bit moves right by 1 position, rightmost bit is discarded)
        
        System.out.println(5 << 1);  // 5 << 1 = 10
        // Explanation
        // 5 in binary:  0 1 0 1
        // Shift left:   1 0 1 0  => 10 (each bit moves left by 1 position, leftmost bit is discarded)
        
        // Unary operators 
        // [ ++ , -- ]
        System.out.println("Unary operators");
        int temp1 = 100;
        System.out.println(temp1++); // o/p - 100 increased by 1
        System.out.println(++temp1); // o/p - 102 

        int temp2 = 100;
        System.out.println(temp2--); // o/p - 100 and decreases by 1
        System.out.println(--temp2); // o/p - 98

        // Ternary operators
        // [ ?: ]
        System.out.println("Ternary Operators");
        System.out.println(2>3? "yes" : "No");
        System.out.println(2<3? "yes" : "No");
    }
    
    
}