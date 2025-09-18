import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class task{
    public static void main(String[] args) throws IOException {

        // FILE 1 :
        PrintWriter pw = new PrintWriter("file1.txt");
        pw.println(555);
        pw.println(666);
        pw.println(777);
        pw.println(555);
        pw.println(666);
        pw.println(999);
        pw.flush();

        // FILE 2 :
       BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
       PrintWriter pw1 = new PrintWriter("file2.txt");

        String line = br.readLine();

        while(line!=null){
            boolean b = false;
            BufferedReader br1 = new BufferedReader(new FileReader("file2.txt"));
            String unique = br1.readLine();
            while(unique!=null){
                if(line.equals(unique)){
                    b = true;
                    break;
                }
                unique = br1.readLine();
            }
            if(b == false){
                pw1.println(line);
                pw1.flush();
               
            }
            line = br.readLine();
        }
        
          br.close();
          pw1.close();
          pw.close();
    }
  

}