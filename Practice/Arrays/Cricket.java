import java.util.*;
public class Cricket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter team  name");
        String team=sc.nextLine();
        System.out.println("Enter no of players");
        int n=sc.nextInt();
        String[] batsman=new String[n];
        String[] bowler=new String[n];
        int[] score=new int[n];
        int[] balls=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter  batsman-" +(i+1)+ " name ");
            batsman[i]=sc.next();
            sc.nextLine();
            System.out.println("Enter  batsman-"+(i+1)+ " score ");
            score[i]=sc.nextInt();
            System.out.println("Enter no of balls faced by batter "+(i+1));
            balls[i]=sc.nextInt();
            if(n==2)
            {
                System.out.println("Enter  bowler  name"+(i+1));
                bowler[i]=sc.next();
            }
           
           
        }
        float Strike[]=new float[n];
        for(int i=0;i<n;i++)
        Strike[i]=(score[i]*100/balls[i]);
        // float economy[]=new float[n];
        // economy[i]=()
        System.out.printf("%-20s %-20s %-10s %-10s ","Batsman-Name","Bowlers-Name","Score","Strikerate");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.printf("%-20s %-20s %-10s %-10s ",batsman[i],bowler[i],score[i],Strike[i]);
            System.out.println();
        }
    }
}
