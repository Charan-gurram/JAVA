import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }
}

// Prime number up to n
    public static boolean checkPrime(int n){
        if(n==1 || n==0)
            return false;
        else{
            for(int i=2;i<=n*0.5;i++){
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void nPrimeNumbers(int n){
        int c=0,i=0;
        while(true){
            if(checkPrime(i)){
                c++;
                if(c<=n){
                    System.out.println(i);
                }
            }
        }
    }