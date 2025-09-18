public class Demothread {
    public static void main(String[] args) {
             printNumbers pn =new printNumbers();
             printLetters pl =new printLetters();
             long start = System.currentTimeMillis();
            //  System.out.println(start);
             pn.start();
             pl.start();
             try
             {
                    pn.join();
                    // pl.join();
             }
             catch(Exception e)
             {
                    System.out.println(e);
             }
             long end=System.currentTimeMillis();
            //  System.out.println(end);
             System.out.println(end-start);

        }
       
}
class printNumbers extends Thread
{

     public void run()
     {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                    System.out.println(e);
            }
        }
        
     }

}
class printLetters extends Thread
{
    public  void run()
     {
        for(char i='A' ; i<='I';i++)
        {
             System.out.println("character:" +i);
             try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                    System.out.println(e);
            }

        }
     }

}