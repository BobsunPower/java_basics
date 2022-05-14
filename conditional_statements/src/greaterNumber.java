import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fst = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.max(fst, sec));
    }
}