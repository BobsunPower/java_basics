import java.util.Scanner;

public class skiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        double price = 18;
        if (roomType.equals("apartment")) {price = 25; if (days < 10) {price *= 0.7;} else if (days <= 15) {price *= 0.65;} else {price *= 0.5;}}
        else if (roomType.equals("president apartment")) {price = 35; if (days < 10) { price *= 0.9;} else if (days <= 15) {price *= 0.85;} else {price *= 0.8;}}
        price *= days - 1;
        if (rating.equals("positive")) {System.out.printf("%s", String.format("%.2f", price *= 1.25));}
        else {System.out.printf("%s", String.format("%.2f", price *= 0.9));}
    }
}