
// Single-Inheritance

public class Parent
{
    int a =10;
    void print()
    {
        System.out.println("print method from Parent class");
    }
    public static void main(String[] args) {
        child2 c2 = new child2();
        c2.print();
        System.out.println(c2.a);
        System.out.println(c2.c);

    }
}
class child1 extends Parent
{
    int b=10;
    void msg()
    {
        System.out.println("msg method in child1");
    }
}
class child2 extends  child1
{
    String c= "charan";
}