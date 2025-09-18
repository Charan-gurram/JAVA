public class Gcd {
    public static void main(String[] args)
    {
            int m=48,n=18;
            // while(m!=0)
            // {
            //     int temp=m;
            //     m=n%m;
            //     n=temp;
            // }
            System.out.println(n);
            int range=(m>n)?n:m,h=0;
            for(int i=1;i<=range;i++){
                if(m%i==0 && n%i==0)
                    h=i;
            }
            System.out.println(h);
            int o=12;
            int r=(m<=n && m<=o)?m:(n<=o)?n:o;
    }
}
