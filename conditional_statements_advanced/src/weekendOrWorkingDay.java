import java.util.Scanner;
public class weekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        String work;
        switch(day) {
            case "Monday": case "Tuesday": case "Wednesday": case "Thursday": case "Friday":
                work = "Working day"; break;
            case "Saturday": case "Sunday":
                work = "Weekend"; break;
            default:
                work = "Error";
        }
        System.out.println(work);
    }
}