import java.util.Scanner;

public class concatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("You are %s %s, a %d-years old person from %s.", scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()), scanner.nextLine());
    }
}