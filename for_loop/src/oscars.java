import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String actor = scan.nextLine();
        double pts = Double.parseDouble(scan.nextLine());
        int judges = Integer.parseInt(scan.nextLine());
        boolean nominated = false;
        for (int i = 0; i < judges; i++)
        {pts += (scan.nextLine().length() * Double.parseDouble(scan.nextLine())) / 2;
            if (pts > 1250.5) {nominated = true; break;}}
        if (nominated)
        {System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, pts);}
        else {System.out.printf("Sorry, %s you need %.1f more!", actor, (1250.5 - pts));}
    }
}