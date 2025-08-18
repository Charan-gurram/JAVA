package Mapcollection;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmp = new HashMap<>();
		hmp.put(1, "charan");
		hmp.put(2, "an");
		hmp.put(3, "cha");
		hmp.put(4, "abc");
		hmp.put(null, "def");
		hmp.put(null, "ghi");     //allows only one null key
		System.out.println(hmp);
		for(Integer k:hmp.keySet())
		{
			System.out.println("key : "+k+" ---> Value: "+hmp.get(k));
		}
		
	}

}
