
class Loops
{
    public void Forloop()
    {
            System.out.println("for loop");
            for(int i=0;i<=10;i++)
            {
                System.out.print(i+" ");
            }
            int sum=0;
            for(int i=1;i<=10;i++)
            {                                                              
                sum=sum+i; 
                                                                        
            }
            System.out.println("\n"+sum); 
            for(int i=20;i>=0;i--)
            {
                System.out.print(i+" ");
            }
    }
    public void whileloop()
    {
        System.out.println("\nWhile loop");
        int i=10;
        while(i<=20)
        {
            System.out.print(i+" ");
            i++;
        }
    }
    public void Dowhile()
    {
        System.out.println("\ndo while loop");
        int i=0;
        do
        {
            System.out.print(i+" ");
            i++;
        }
        while(i<=5);

    }
    public static void main(String[] args) {
        Loops obj=new Loops();
        obj.Forloop();
        obj.whileloop();
        obj.Dowhile();
       
    }
}

