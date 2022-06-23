import java.util.Scanner;

public class cinemaTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movie = scan.nextLine();
        int tickets = 0; int kids = 0; int standard = 0; int student = 0;
        while (!movie.equals("Finish")) { int seats = Integer.parseInt(scan.nextLine()); int sold = 0; String ticket = scan.nextLine();
            while (!ticket.equals("End")) {
                sold++; tickets++;
                switch (ticket) {
                    case "student": student++; break;
                    case "standard": standard++; break;
                    case "kid": kids++; break;}
                if (sold >= seats) {break;}
                ticket = scan.nextLine();}
            System.out.printf("%s - %.2f%% full.%n", movie, sold * 1.0 / seats * 100);
            movie = scan.nextLine();}
        System.out.printf("Total tickets: %d%n", tickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / tickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / tickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kids * 1.0 / tickets * 100);
    }
}