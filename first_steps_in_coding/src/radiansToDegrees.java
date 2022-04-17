import java.util.Scanner;

public class radiansToDegrees {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Double.parseDouble(scanner.nextLine()) * 180 / Math.PI);
    }
}