import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int facebook = 150; int instagram = 100; int reddit = 50;
        int openedTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i < openedTabs; i++) {String tab = scanner.nextLine();
            switch(tab) {
                case "Facebook": salary -= facebook; break;
                case "Instagram": salary -= instagram; break;
                case "Reddit": salary -= reddit; break;}
            if (salary <= 0) {System.out.println("You have lost your salary."); break;}}
        if (salary > 0) {System.out.printf("%.0f", salary);}
    }
}