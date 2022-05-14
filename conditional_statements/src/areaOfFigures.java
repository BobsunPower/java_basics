// Judge returns "Грешка при компилация" but it works and looks good.
import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = switch (figure) {
            case "square" -> Math.pow(Double.parseDouble(scanner.nextLine()), 2);
            case "rectangle" -> Double.parseDouble(scanner.nextLine()) * Double.parseDouble(scanner.nextLine());
            case "circle" -> Math.PI * (Math.pow(Double.parseDouble(scanner.nextLine()), 2));
            case "triangle" -> (Double.parseDouble(scanner.nextLine()) * Double.parseDouble(scanner.nextLine()) / 2);
            default -> 0;
        };
        System.out.printf("%.3f", area);
    }
}

// Judge 100/100
//public class areaOfFigures {
//    public static void main(String[] arg) {
//        Scanner scanner = new Scanner(System.in);
//        String figure = scanner.nextLine();
//        double area = 0;
//        switch (figure) {
//            case "square":
//                area = Math.pow(Double.parseDouble(scanner.nextLine()), 2);
//                break;
//            case "rectangle":
//                area = Double.parseDouble(scanner.nextLine()) * Double.parseDouble(scanner.nextLine());
//                break;
//            case "circle":
//                area = Math.PI * (Math.pow(Double.parseDouble(scanner.nextLine()), 2));
//                break;
//            case "triangle":
//                area = (Double.parseDouble(scanner.nextLine()) * Double.parseDouble(scanner.nextLine()) / 2);
//                break;
//        }
//        System.out.printf("%.3f", area);
//    }
//}