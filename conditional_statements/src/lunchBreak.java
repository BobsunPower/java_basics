import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String show = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine()) * 0.625;
        if (time >= episode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", show, Math.ceil(time - episode));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", show, Math.ceil(episode - time));
        }
    }
}
