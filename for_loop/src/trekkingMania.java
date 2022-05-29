import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class trekkingMania {
    public static DecimalFormat df = new DecimalFormat("0.00");
    public static String percentFormat(double vlu)
    {return df.format(vlu) + "%";}
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
        List<String> lst= new ArrayList<>();
        lst.add(percentFormat(musala / climbers * 100));
        lst.add(percentFormat(montBlanc / climbers * 100));
        lst.add(percentFormat(kilimanjaro / climbers * 100));
        lst.add(percentFormat(k2 / climbers * 100));
        lst.add(percentFormat(everest / climbers * 100));
        lst.forEach(System.out::println);
    }
}