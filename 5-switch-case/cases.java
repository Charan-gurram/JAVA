import java.util.Scanner;
class Cases
{
    public static void main(String args[])
    {
            System.out.println(" Restaurant Menu");
            System.out.println("\t A.Starters");
            System.out.println("\t B.Main Course");
            System.out.println("\t C. Ice-Creams");
            System.out.println("Enter your Required choice");
                char inp;
                Scanner sc=new Scanner(System.in);
                inp=sc.nextLine().charAt(0);
                switch (inp) {
                case 'A':
                     System.out.println("You have selected Starters");
                     System.out.println("\t a Chicken 65");
                     System.out.println("\t b Chicken tikkka");
                    System.out.println("\t c Majestic");
                    System.out.println("Enter your desired starter");
                    char schA=sc.nextLine().charAt(0);
                    switch(schA)
                    {
                case 'a':
                    System.out.println("Chicken 65-price:350");
                    break;
                case 'b':
                    System.out.println("Chicken tikka-Price:329");
                    break;
                case 'c':
                    System.out.println("Majestic-price:339");
                    break;
                    }
                    break;
                case 'B':
                    System.out.println("You have selected main course");
                    System.out.println("\t d SP Biryani ");
                    System.out.println("\t e Tandoori Biryani");
                    System.out.println("\t f Fry Piece Biryani");
                    System.out.println("Enter your desired biryani");
                    char schB= sc.nextLine().charAt(0);
                    switch(schB)
                    {
                    case 'd':
                        System.out.println("SP Biryani-price:250 ");
                        break;
                    case 'e':
                        System.out.println(" Tandoori Biryani-price:299 ");
                        break;
                    case 'f':
                        System.out.println("Fry Piece -price:329");
                        break;
                    }
                    break;
                case 'C':
                    System.out.println("Choose Icecreams");
                    System.out.println("\t g Vanilla");
                    System.out.println("\t h Oreo");
                    System.out.println("\t i DryFruit nuts");
                    System.out.println("Enter your desird icecream");
                    char schC=sc.nextLine().charAt(0);
                    switch(schC)
                    {
                case 'g':
                    System.out.println("Vanilla-price:149");
                case 'h':
                    System.out.println(" Oreo-price:199");
                    break;
                case 'i':
                    System.out.println("DryFruit Nuts-price:249");
                    }
                
                break;
                    
                default:
                    System.out.println("invalid option");
                    break;
            }
    }
}

