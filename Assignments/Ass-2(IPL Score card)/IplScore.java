import java.util.*;

public class IplScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int totalScore = 0, outs = 0, striker = 0;
        int n = sc.nextInt();
        sc.nextLine();

        String[] players = new String[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine();
        }

        // System.out.println(Arrays.toString(players));
        System.out.print("Enter target score: ");
        int target = sc.nextInt();

        for (int over = 0; over < 3; over++)
         {
            int overRuns = 0, overOuts = 0;
            String[] balls = new String[6];

            System.out.print("Enter bowler name: ");
            sc.nextLine();
            String bowler = sc.nextLine();

            for (int ball = 0; ball < 6; ball++)
             {
                System.out.print("Ball " + (ball + 1) + " - [" + players[striker] + "] on strike. Enter runs or 'W': ");
                String input = sc.next();
                balls[ball] = input;

                if (input.equals("W"))
                 {
                    System.out.println("Player out.");
                    outs++;
                    overOuts++;
                    players[striker] = "Out";

                    if (outs < n)
                     {
                        System.out.println("Remaining players:");
                        for (int p = 0; p < n; p++) 
                        {
                            if (!players[p].equals("Out")) 
                            {
                                System.out.println((p + 1) + ". " + players[p]);
                            }
                        }
                        System.out.print("Enter next batsman number: ");
                        striker = sc.nextInt() - 1;
                    } 
                    else 
                    {
                        System.out.println("Team all out!");
                        break;
                    }
                } 
                else
                 {
                    int run = Integer.parseInt(input);
                    totalScore += run;
                    overRuns += run;
                }

                if (totalScore >= target) 
                {
                    System.out.println("Won the match.");
                    break;
                }
            }

            System.out.println("\nOver " + (over + 1) + " - Bowler: " + bowler);
            System.out.print("Ball-by-ball: ");
            for (String b : balls) 
            {
                if (b != null) System.out.print(b + " ");
            }
            System.out.println("\nRuns in this over: " + overRuns);
            System.out.println("Wickets in this over: " + overOuts);

            if (totalScore >= target || outs == n) break;
        }
         System.out.println("\nFinal Score: " + totalScore + "/" + outs);
        if (totalScore >= target) 
        {
            System.out.println("Team won the match!");
        } else
         {
            System.out.println("Team lost the match!");
        }
        sc.close();
    }
}
