// class is a template for creating the objects or it is a bluprint for the object creation
// It consists of data members and methods
public class Classobj
{
    int a = 10;
    void print(){
        System.out.println("Print method in classObj class");
    }
    public static void main(String args[])
{
    // object : It allocates memory for methods and data members.
    // classname Objname = new classname ();
    // obj name is reference and when we write new the memory will be allocacted to class members
        new Classobj().print();  //not creating reference direclty creating the object
        Classobj o = new Classobj();   // creating object and assigmimg to variable known as reference variable
        
   
}
}
