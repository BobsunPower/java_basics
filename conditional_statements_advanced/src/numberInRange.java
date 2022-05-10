import java.util.Scanner;
public class numberInRange {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String inRange = inRange = num >= -100 && num <= 100 && num != 0 ? "Yes" : "No";
        System.out.print(inRange);
    }
}
