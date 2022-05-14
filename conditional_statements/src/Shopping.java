import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int qtyGC = Integer.parseInt(scanner.nextLine());
        int qtyCPU = Integer.parseInt(scanner.nextLine());
        int qtyRAM = Integer.parseInt(scanner.nextLine());
        int priceGC = qtyGC * 250;
        double priceCPU = qtyCPU * (priceGC * 0.35);
        double priceRAM = qtyRAM * (priceGC * 0.1);
        double expenses = priceGC + priceCPU + priceRAM;
        if (qtyGC > qtyCPU) {
            expenses *= 0.85;
        }
        if (budget >= expenses) {
            System.out.printf("You have %.2f leva left!", budget - expenses);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", expenses - budget);
        }
    }
}
