public class Variables {
    int a=20; //Instance Variable(written inside class outside method)(seperate object will be created)
    static float f =2.06f;
    //( static variable doesnt need object creation written inside class outside method by using static keyword)
    //Object memory is shared
    public char hello()
    {
    	char c='S';//Local Variable
    	return c;
    }
	public static void main(String[] args) {
		Variables v=new Variables();//object creation
        Variables v1=new Variables();
        v.a=500;
		System.out.println(v.a);
        System.out.println(v1.a);
		System.out.println(v.hello());
        Variables.f=7.635f;
        System.out.println(v.f);
        System.out.println(v1.f);

		
		

	}

}
