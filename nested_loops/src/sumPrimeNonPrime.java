import java.util.Scanner;

public class sumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int prime = 0;
        int nonPrime = 0;
        while (!n.equals("stop")) {boolean isPrime = true; int number = Integer.parseInt(n);
            if (number < 0) {System.out.println("Number is negative."); n = scan.nextLine(); continue;}
            for (int i = 2; i < number; i++) {if (number % i == 0) {isPrime = false; break;}}
            if (isPrime){prime += number;}
            else {nonPrime += number;}
            n = scan.nextLine();}
        System.out.printf("Sum of all prime numbers is: %d%n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);}
}