import java.util.LinkedList;
public class CitiesList
{
    public static void main(String[] args)
    {
        LinkedList<String> cities =new LinkedList<String>();
        cities.add("Hyderabad");
        cities.add("Vijayawada");
        cities.add("Vizag");
        cities.add("Delhi");
        cities.addFirst("Mumbai");                     //to add in linkedlist at firstof linkedlist
        cities.addLast("Gurugram");                    //to add elemtn in end of the linkedllist
        cities.removeFirst();                             //to remove the last element of linkeldist
        cities.removeLast();                              //to remove the first elemetn in linkedlist
        System.out.println(cities.getFirst());             //to get the  first element in linkedlist
        System.out.println(cities.getLast());                  //to get the last elemnt in the linkedlist
        System.out.println(cities);             

        //printing linkedlist using for loop
        System.out.println("----for loop ------");
        for(int i=0;i<cities.size();i++)
        {
            System.out.println(cities.get(i));
        }

        // //printing linkedlist using for-each loop
        System.out.println("-----for each loop");
        for(String str:cities)
        {
            System.out.println(str);
        }
    }
}
