//| Method                                         | Description                                              |
//| ---------------------------------------------- | -------------------------------------------------------- |
//| `Collections.max(list)`                        | Returns the maximum element in the list (natural order). |
//| `Collections.min(list)`                        | Returns the minimum element in the list (natural order). |
//| `Collections.sort(list)`                       | Sorts the list in ascending order.                       |
//| `Collections.sort(list, comparator)`           | Sorts with a custom comparator.                          |
//| `Collections.reverse(list)`                    | Reverses the order of elements.                          |
//| `Collections.shuffle(list)`                    | Randomly shuffles elements.                              |
//| `Collections.frequency(list, element)`         | Counts how many times an element appears.                |
//| `Collections.replaceAll(list, oldVal, newVal)` | Replaces all occurrences of a value.                     |
//| `Collections.copy(destList, srcList)`          | Copies all elements from one list to another.            |
//| `Collections.swap(list, i, j)`                 | Swaps two elements in the list.                          |
//| `Collections.fill(list, obj)`                  | Replaces every element with the given object.            |
//| `Collections.unmodifiableList(list)`           | Returns an unmodifiable view of the list.                |
package listcollection;
import java.util.*;
public class Arraylistp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<>();
		li.add(3);
		li.add(5);
		li.add(23);
		li.add(7);	
		li.add(100);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(8);
		li.add(11);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		Collections.shuffle(li);
		System.out.println(li);
		for (Integer i : li) 
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int count=Collections.frequency(li,5);
		System.out.println(count);
	
	}

}
