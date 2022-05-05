import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double meterSeconds = Double.parseDouble(scanner.nextLine());
        double attemptSeconds = Math.floor(distanceMeters / 15) * 12.5 + distanceMeters * meterSeconds;
        if (attemptSeconds < recordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", attemptSeconds);
        } else {
            double slower = (attemptSeconds - recordSeconds);
            System.out.printf("No, he failed! He was %.2f seconds slower.", slower);
        }
    }
}