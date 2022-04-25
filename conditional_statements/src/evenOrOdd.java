import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        if (Integer.parseInt(scanner.nextLine()) % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
