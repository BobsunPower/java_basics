import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tennisRanklist {
    public static DecimalFormat df = new DecimalFormat("0.00");
    public static String percentFormat(double vlu)
    {return df.format(vlu) + "%";}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tournaments = Double.parseDouble(scanner.nextLine());
        double initialPts = Double.parseDouble(scanner.nextLine());
        double wins = 0; int pts = 0;
        for (int i = 0; i < tournaments; i++)
        {String match = scanner.nextLine();
            switch (match) {
                case "W": pts += 2000; wins++; break;
                case "F": pts += 1200; break;
                case "SF": pts += 720; break;}}
        List<String> lst= new ArrayList<>();
        lst.add(("Final points: " + String.valueOf((int) (initialPts + pts))));
        lst.add(("Average points: " + String.valueOf((int) (pts / tournaments))));
        lst.add(percentFormat(wins / tournaments * 100));
        lst.forEach(System.out::println);
    }
}