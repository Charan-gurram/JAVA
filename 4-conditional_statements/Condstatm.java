import java.util.Scanner;
class Condstatm
{
    public static void main(String[] args) 
{
   int a=20;
   int b=10;
    //if  (if we know the value should be true)
    System.out.println("'if stmnt'");
   if(a>b)
   {
    System.out.println("a is greater than b");
   }
    // if-else(If the stmt is true then it if executes otherwise else executed)
    int  income=500000;
    System.out.println("'if-else Statement'");
    if(income>=300000)
    {
        System.out.println("You are elgible for White ration card");
    }
    else
    {
            System.out.println("You are not  elgible for White ration card");
    }
    // else-if ladder(if we have multiple conditions)
    System.out.println("'else-if ladder stmt'");
    int bal=10000;
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter withdraw amount");
    int wthdrw=sc.nextInt();
   
        if(bal<wthdrw)
    {
        System.out.println("You cannott withdraw from ur bank as u have in bank only 10000/-");
    }
    else if(bal>wthdrw)
    {
        System.out.println("You can withdraw from ur bank");
    }
    else
    {
        System.out.println("Incoorect otion selected");
    }
}


}