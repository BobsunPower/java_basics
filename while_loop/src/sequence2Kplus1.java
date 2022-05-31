import java.util.Scanner;

public class sequence2Kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cap = Integer.parseInt(scanner.nextLine()); int sum = 1;
        while (true) {System.out.println(sum); sum = sum * 2 + 1; if (sum > cap) {break;}}}
}