import java.util.Scanner;

public class onTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHours = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int arrivalHours = Integer.parseInt(scan.nextLine());
        int arrivalMinutes = Integer.parseInt(scan.nextLine());
        int examTime = examHours * 60 + examMinutes;
        int arrivalTime = arrivalHours * 60 + arrivalMinutes;
        int timeGap = Math.abs(examTime - arrivalTime);
        if (examTime < arrivalTime) {System.out.println("Late");
            if (timeGap < 60) {System.out.printf("%d minutes after the start",timeGap % 60);}
            else {System.out.printf("%d:%02d hours after the start", timeGap / 60, timeGap % 60);}}
        else if (timeGap <= 30) {System.out.println("On time"); if (timeGap > 0) {System.out.printf("%d minutes before the start", timeGap);}}
        else {System.out.println("Early");
            if (timeGap < 60) {System.out.printf("%d minutes before the start",timeGap % 60);}
            else {System.out.printf("%d:%02d hours before the start", timeGap / 60, timeGap % 60);}}
    }
}
