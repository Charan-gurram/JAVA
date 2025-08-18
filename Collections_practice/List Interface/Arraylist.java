import java.util.*;
public class Arraylist
{
    public static void main(String[] args)
    {
        ArrayList<String> names=new ArrayList<String>();
        names.add("charan");
        names.add("karthik");
        names.add("arun");
        names.add("kowshik");
        names.add("govardhan");
        names.add(0,"gurram");        //add an element at specified index
        names.set(2,"rayee");       //replaces an element in the particular index
        names.remove(0);                      //remove particular index element in the array list
        System.out.println(names);                //printing the array list
        Collections.sort(names);
        System.out.println(names.get(1));   //gets the element at specififed index
        System.out.println(names.size());         //gets the size of array list
        System.out.println(names);                //printing the array list


        //Looping through the ArrayList usinf for loop

        System.out.println("printing using for loop");

        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }

         //Looping through the ArrayList usinf foreach loop
         System.out.println("using for each loop");
         for(String str:names)
         {
            System.out.println(str);
         }

      
    }
}