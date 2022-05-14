import java.util.Scanner;

public class radiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Double.parseDouble(scanner.nextLine()) * 180 / Math.PI);
    }
}