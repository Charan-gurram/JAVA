// construcotrs are used to intialise the instance variables 
// By default every time while we create object non parametrized constructor will be called
public class Parent 
{
    int a;
    String s;
    Parent()
    {
        System.out.println("Default  parent constructor called");
    }
    Parent(int a)
    {
        this.a=a;
        System.out.println(a + " : from paremetrized constructor");
    }
    Parent (String s,int a)
    {
           this.s=s;
            this.a=a;
        System.out.println(a +" from double parametrised constructor");
    }
    
   

    public static void main(String[] args) {
        // Parent p= new Parent(); //Default constructor will be called
        // Parent p1 = new Parent(5);
        // Parent p3 = new Parent("hello",10);
        D d = new D(25);


    }
}
class D extends Parent
{
    int c;
    D(int c)
    {
        this.c=c;
        System.out.println(c+" :from child class single parametrised constructor");
    }
}
