import java.util.Scanner;

public class godzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
        double clothing = Double.parseDouble(scan.nextLine()) * people;
        double decor = budget * 0.1;
        if (people > 150) {
            clothing *= 0.9;
        }
        double expenses = decor + clothing;
        if (expenses > budget) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", expenses - budget);
        } else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget - expenses);
        }
    }
}