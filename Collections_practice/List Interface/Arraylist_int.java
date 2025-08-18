import java.util.*;
public class Arraylist_int 
{
    public static void main(String[] args)
     {
        ArrayList<Integer> nums= new ArrayList<Integer>();
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(4);
        nums.add(6);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);  
        
    }
    
}
