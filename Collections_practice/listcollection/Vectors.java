package listcollection;
import java.util.*;
public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<>();
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		li.add("list");
		
		Vector<String> vec=new Vector<>();
		vec.add("hi");
		vec.add("hello");
		vec.add("namasthe");
		vec.add("hi");
		vec.add("hello");
		vec.add("namasthe");
		vec.add("hi");
		vec.add("hello");
		vec.add("namasthe");
		vec.add("hi");
		vec.add("hello");
		vec.add("namasthe");
//		vec.add(1);
//		vec.add(2);
		System.out.println(vec);
		vec.remove(3);
		vec.add(1,"10");
		System.out.println(vec);
		vec.addAll(li);
		System.out.println(vec);
		vec.addAll(2,li);
		System.out.println(vec);
		
		
	}

}
