import java.util.Scanner;
public class InpArr {
    public void Singlelineinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        sc.nextLine();
        String inp=sc.nextLine();
        String[] num=inp.split(" ");
        int numbs[]=new int[num.length];
        for(int i=0;i<num.length;i++)
        {
            numbs[i]=Integer.parseInt(num[i]);
        }
        for(int nu:numbs)
        {
            System.out.print(nu+" ");
        }
    }
    public static void main(String[] args) {
        InpArr obj=new InpArr();
        obj.Singlelineinput();
    }
}
