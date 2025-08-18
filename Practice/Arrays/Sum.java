import java.util.Scanner;
public class Sum
{
    public void ArrSum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            // System.out.println("Enter the element at index : "+i);
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int num:arr)
        {
            sum+=num;
        }
        System.out.println("total sum: "+sum);

    }
    public static void main(String[] args)
     {
        Sum obj=new Sum();
        obj.ArrSum();
    }
}