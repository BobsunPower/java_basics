import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mny = scan.nextLine();
        double sum = 0;
        while (!mny.equals("NoMoreMoney")) {
            double qty = Double.parseDouble(mny);
            if (qty < 0) {System.out.println("Invalid operation!"); break;}
            System.out.printf("Increase: %.2f%n", qty);
            sum += qty; mny = scan.nextLine();}
        System.out.printf("Total: %.2f", sum);
    }
}