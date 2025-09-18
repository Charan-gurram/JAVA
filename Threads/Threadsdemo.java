public class Threadsdemo
{
        public static void main(String[] args) {
             printNumbers pn =new printNumbers();
             printLetters pl =new printLetters();
             long start = System.currentTimeMillis();
             System.out.println(start);
             pn.printNums();
             pl.pntLts();
             long end=System.currentTimeMillis();
             System.out.println(end);
             System.out.println(end-start);

        }
       


}
class printNumbers
{
     void printNums()
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
class printLetters
{
     void pntLts()
     {
        for(char i='A' ; i<='E';i++)
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