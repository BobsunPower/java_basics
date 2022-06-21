import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int area = length * width * height;
        String data = scan.nextLine();
        while (!data.equals("Done")) {int boxes = Integer.parseInt(data);
            if (area < boxes) {System.out.printf("No more free space! You need %d Cubic meters more.", boxes - area); return;}
            else {area -= boxes;}
            data = scan.nextLine();}
        System.out.printf("%d Cubic meters left.", area);
    }
}