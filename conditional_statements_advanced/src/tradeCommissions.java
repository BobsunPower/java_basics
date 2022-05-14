import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class tradeCommissions {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sale = Double.parseDouble(scanner.nextLine());
        List<String> lst = Arrays.asList("Sofia", "Varna", "Plovdiv");
        if (sale < 0 || !lst.contains(city)) {
            System.out.println("error");
            return;
        }
        switch(city) {
            case "Sofia":
                if (sale > 0 && sale <= 500) {
                    sale *= 0.05;
                } else if (sale > 500 && sale <= 1000) {
                    sale *= 0.07;
                } else if (sale > 1000 && sale <= 10000) {
                    sale *= 0.08;
                } else if (sale > 10000) {
                    sale *= 0.12;
                }
                break;
            case "Varna":
                if (sale > 0 && sale <= 500) {
                    sale *= 0.045;
                } else if (sale > 500 && sale <= 1000) {
                    sale *= 0.075;
                } else if (sale > 1000 && sale <= 10000) {
                    sale *= 0.1;
                } else if (sale > 10000) {
                    sale *= 0.13;
                }
                break;
            case "Plovdiv":
                if (sale > 0 && sale <= 500) {
                    sale *= 0.055;
                } else if (sale > 500 && sale <= 1000) {
                    sale *= 0.08;
                } else if (sale > 1000 && sale <= 10000) {
                    sale *= 0.12;
                } else if (sale > 10000) {
                    sale *= 0.145;
                }
                break;
            default:
                System.out.println("error");
                return;
        }
        System.out.printf("%.2f", sale);
    }
}