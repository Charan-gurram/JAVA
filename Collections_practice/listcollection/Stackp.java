package listcollection;
import java.util.*;
public class Stackp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack<Integer> stk= new Stack<>();
		stk.push(5);
		stk.push(1);
		stk.push(0);
		stk.push(4);
		stk.push(-1);
		stk.push(8);
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk);
		System.out.println(stk.search(0));
		

	}

}
