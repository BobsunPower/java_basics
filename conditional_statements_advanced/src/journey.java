import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "Europe";
        String placeToStay = "Hotel";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                placeToStay = "Camp";
                budget *= 0.3;
            } else if (season.equals("winter")) {
                budget *= 0.7;
            }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                placeToStay = "Camp";
                budget *= 0.4;
            } else if (season.equals("winter")) {
                budget *= 0.8;
            }
        } else if (budget > 1000) {
            budget *= 0.9;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", destination, placeToStay, budget);
    }
}