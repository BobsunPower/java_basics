import java.util.Scanner;
public class personalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        if (age >= 16 && sex.equals("m")) {
            System.out.print("Mr.");
        } else if (age < 16 && sex.equals("m")) {
            System.out.print("Master");
        } else if (age >= 16 && sex.equals("f")) {
            System.out.print("Ms.");
        } else if (age < 16 && sex.equals("f")) {
            System.out.print("Miss");
        }
    }
}