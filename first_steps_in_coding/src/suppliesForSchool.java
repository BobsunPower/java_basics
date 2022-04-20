import java.util.Scanner;

public class suppliesForSchool {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(((Integer.parseInt(scanner.nextLine()) * 5.8) + (Integer.parseInt(scanner.nextLine()) * 7.2) + (Integer.parseInt(scanner.nextLine()) * 1.2)) * ((100 - Double.parseDouble(scanner.nextLine())) / 100));
    }
}