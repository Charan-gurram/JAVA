import java.util.*;
public class OneDimArray 
{
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter value for index "+i);   
        arr[i]=sc.nextInt();
    }
    System.out.println( "Array is : " +Arrays.toString(arr));   //printing array using Arrays.toString method
    }
    public void intiarray()
    {
        int nums[]={1,2,3,4,5};
        System.out.println("nums Array: "+Arrays.toString(nums));
    }
    public void Arr()
    {
        int nums[]={6,7,8,9,10};
        for(int i=0;i<nums.length;i++)      //printing aray using for looop
        {
            System.out.print(nums[i]+" ");
        }
    }
    public void Arrfor()
    {
        int nums[]={4,5,6,7,8,9,10,2,5};
        for(int n:nums)                           //printing array using for each
        {
            System.out.print(n+" ");
        }
    }
public static void main(String[] args)
{
    
    OneDimArray obj=new OneDimArray();
    obj.array();
    obj.intiarray();
    obj.Arr();
    obj.Arrfor();
}
}
