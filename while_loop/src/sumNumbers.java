import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cap = Integer.parseInt(scanner.nextLine()); int sum = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (sum >= cap) {System.out.println(sum); break;}
            sum += Integer.parseInt(scanner.nextLine());}}
}