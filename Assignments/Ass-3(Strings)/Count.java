import java.util.*;

public class Count {
    public static void main(String[] args) {
        int vc = 0;
        int cc = 0;
        int dc = 0;
        int sch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) 
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                {
                    vc++;
                } else {
                    cc++;
                }

            }
            else if(Character.isDigit(ch))
            {
                dc++;
            }
            else
            sch++;

        }
        System.out.println("Vowels count : "+vc);
        System.out.println("Consonants count : "+cc);
        System.out.println("Digit count : "+dc);
        System.out.println("Specail char count : "+sch);
    }
}
