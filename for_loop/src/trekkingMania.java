import java.util.Scanner;

public class trekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double crews = Integer.parseInt(scanner.nextLine());
        double musala = 0;
        double montBlanc = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        double climbers = 0;
        for (int i = 0; i < crews; i++) {double crew = Integer.parseInt(scanner.nextLine()); climbers += crew;
            if (crew <= 5) {musala += crew;}
            else if (crew <= 12) {montBlanc += crew;}
            else if (crew <= 25) {kilimanjaro += crew;}
            else if (crew <= 40) {k2 += crew;} else {everest += crew;}}
        System.out.printf("""
                %.2f
                %.2f
                %.2f
                %.2f
                %.2f
                """, musala / climbers * 100, montBlanc / climbers * 100, kilimanjaro / climbers * 100, k2 / climbers * 100, everest / climbers * 100);
    }
}