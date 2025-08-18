public class UserTransactions
{
    public static void main(String[] args) 
    {
        int trans[][]=new int[3][3];
        trans[0][0]=150;
        trans[0][1]=150;
        trans[0][2]=150;

        trans[1][0]=150;
        trans[1][1]=450;
        trans[1][2]=250;

        trans[2][0]=150;
        trans[2][1]=150;
        trans[2][2]=150;
        int sum=0;
          for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                    System.out.println("user "+(i+1)+" Transaction "+(j+1)+" is "+(trans[i][j]));
                    sum+=trans[i][j];
            }
              System.out.println("Total sum of transactions of User "+(i+1)+" is " +sum);
        }
      }
}