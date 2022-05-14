import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subscription = Integer.parseInt(scanner.nextLine());
        double sneakers = subscription * 0.6;
        double kit = sneakers * 0.8;
        double ball = kit * 0.25;
        double other = ball * 0.2;
        System.out.println(subscription + sneakers + kit + ball + other);
    }
}