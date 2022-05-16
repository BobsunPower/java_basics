import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.next());
        double apartmentPrice = 65;
        double studioPrice = 50;
        switch(month) {
            case "May": case "October":
                if (nights > 14) {studioPrice *= 0.7;}
                else if (nights > 7) {studioPrice *= 0.95;} break;
            case "June": case "September": studioPrice = 75.2; apartmentPrice = 68.7;
                if (nights > 14) {studioPrice *= 0.8;} break;
            case "July": case "August": studioPrice = 76; apartmentPrice = 77; break;
    }
        if (nights > 14) {apartmentPrice *= 0.9;}
        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", apartmentPrice * nights, studioPrice * nights);
    }
}