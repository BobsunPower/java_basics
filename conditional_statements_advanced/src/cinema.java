import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        double r = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        switch(ticket) {
            case "Premiere": System.out.printf("%.2f", (12 * r * c)); break;
            case "Normal": System.out.printf("%.2f", (7.5 * r * c)); break;
            case "Discount": System.out.printf("%.2f", (5 * r * c)); break;
        }
    }
}