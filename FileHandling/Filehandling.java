import java.io.*;
public class Filehandling
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("demo.txt");
        f.createNewFile();
        System.out.println(f.exists());
        FileWriter fw= new FileWriter("demo.txt");
        fw.write("hello");
        fw.write("Adding content using filewriter");
        fw.flush();
        fw.close();
        FileReader fr=new FileReader("demo.txt");     // Reads only one character at a time
        int Result = fr.read();
        while(Result != -1)
        {
                  System.out.print((char)Result);
                Result = fr.read();
        }
    //   Creating a folder
     File d =new File("DemoFolder");
     d.mkdir();
     File f1 = new File(d, "abc.txt");
     f1.createNewFile();
     File d1 =new File("DemoFolder","childemofolder");
     d1.mkdir();
     

    }
}