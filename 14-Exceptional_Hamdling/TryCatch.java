public class TryCatch
{
    static int i=10;
    public static void main(String[] args) {
         int arr[]={5,2,7,5,3};

        //  We  should write try block with catch block or finally block without both not possible.
        //  After finding exception then the try block will not executes the remaining lines in the try block.
        // we should not write try blocks continously without closing i.e writing after catch or finally blocks only it will accepts

        try
        {
                 System.out.println(arr[5]);
                 System.out.println("try block");
        }
        //we cant write catch block without try block
        //Catch block dont executes if there is no any exception in the try block
        catch(ArrayIndexOutOfBoundsException e)                                            
        {
            System.out.println("Dont try to access the array out of limit");
            System.out.println(e);  //It displays both the exception class and the message
            System.out.println(e.getMessage()); //Displays only the message inside the exception class
            System.out.println(e.getClass());  //Displays class name with package also
            System.out.println(e.getClass().getSimpleName()); //Displays class name without package
        }
        try {
            System.out.println(i/0);
        } 
        catch(Exception e)
        {
            System.out.println("Dont divide by zero");
            e.printStackTrace();   //it will display the detailed exception report 
            
        }
        // finally block always executes even if there is exception or not 
        finally
        {
            System.out.println("finally block always executes");
        }
        System.out.println("Line after catch block"); 
}
}
