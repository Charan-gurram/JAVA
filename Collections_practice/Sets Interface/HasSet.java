import java.util.HashSet;

public class HasSet {
    public static void main(String[] args) {
        HashSet<Integer> oddnums = new HashSet<Integer>();
        oddnums.add(1);
        oddnums.add(3);
        oddnums.add(9);
        oddnums.add(11);
        oddnums.add(5);
        oddnums.add(7);
        oddnums.add(3);
        System.out.println(oddnums);
        System.out.println(oddnums.contains(3));

        // foreach-loop
        System.out.println("----for-each loop nums----");
        for (int i : oddnums) {
            System.out.println(i);
        }

        HashSet<String> names = new HashSet<String>();
        names.add("abc");
        names.add("def");
        names.add("bca");
        names.add("ghi");
        System.out.println(names);
        names.remove("bca"); // removes the element in the hashset
        System.out.println(names);
        System.out.println((names.contains("dgh"))); // checks the value contain in the hashset

    }
}