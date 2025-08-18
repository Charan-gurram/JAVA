class Datatypes
{
    int a=10;
    long lo=12345678987654321l;
    short s=12;
    float f=26.84689f;
    double d=2.9475324567389405d;
    double dl=5;
    float fs=2;
    //byte b=129;   out of range
    byte b=124;
    public static void main(String args[])
    {
        Datatypes D=new Datatypes();
        System.out.println(D.a);
        System.out.println(D.lo);
        System.out.println(D.s);
        System.out.println(D.fs);
        System.out.println(D.b);
        System.out.println(D.d);
        System.out.println(D.dl);

    }
}