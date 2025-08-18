import java.util.TreeSet;

public class TreSet {
    public static void main(String[] args) {
        TreeSet<Float> sals=new TreeSet<Float>();
        sals.add(23.56f);
        sals.add(13.56f);
        sals.add(3.56f);
        sals.add(63.56f);
        sals.add(53.56f);
        sals.add(93.56f);
        System.out.println(sals);
        sals.remove(23.56f);
        System.out.println(sals);
        System.out.println(sals.size());
    }
}
