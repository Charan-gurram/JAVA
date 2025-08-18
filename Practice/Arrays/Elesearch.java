public class Elesearch
{
    public static void main(String[] args) {
        int arr[]={1,2,6,4,10,5};
        int tar=5;
        boolean temp=false;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==tar) 
            {
                temp=true;
                 if(temp) System.out.println("Element found at index : " +i);
             }
           
        }
        if(temp==false)System.out.println("Element not found");
}
}