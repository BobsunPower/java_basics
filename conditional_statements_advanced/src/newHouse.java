import java.util.Scanner;

public class newHouse {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double expenses = 0;
        switch(flowers) {
            case "Roses":
                expenses = quantity * 5;
                if (quantity > 80) {expenses *= 0.9;} break;
            case "Dahlias":
                expenses = quantity * 3.8;
                if (quantity > 90) {expenses *= 0.85;} break;
            case "Tulips":
                expenses = quantity * 2.8;
                if (quantity > 80) {expenses *= 0.85;} break;
            case "Narcissus":
                expenses = quantity * 3;
                if (quantity < 120) {expenses *= 1.15;} break;
            case "Gladiolus":
                expenses = quantity * 2.5;
                if (quantity < 80) {expenses *= 1.2;} break;
            default: break;
        }
        if (budget >= expenses) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, budget - expenses);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", expenses - budget);
        }
    }
}