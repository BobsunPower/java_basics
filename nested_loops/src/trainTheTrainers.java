import java.util.Scanner;

public class trainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jury = Integer.parseInt(scan.nextLine());
        String presentation = scan.nextLine();
        double grades = 0;
        double average = 0;
        int count = 0;
        while (!presentation.equals("Finish")) {
            for (int i = 0; i < jury; i++) {double grade = Double.parseDouble(scan.nextLine()); grades += grade; count++;}
            System.out.printf("%s - %.2f.%n", presentation, grades / jury);
            average += grades; grades = 0; presentation = scan.nextLine();}
        System.out.printf("Student's final assessment is %.2f.", average / count);}
}