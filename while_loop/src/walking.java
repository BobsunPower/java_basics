import java.util.Scanner;

public class walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goal = 10000;
        int steps = 0;
        String data = scan.nextLine();
        while (!data.equals("Going home")) {steps += Integer.parseInt(data);
            if (steps >= goal) {System.out.printf("Goal reached! Good job!\n%d steps over the goal!", steps - goal); return;}
            data = scan.nextLine();}
        steps += Integer.parseInt(scan.nextLine());
        if (steps >= goal) {System.out.printf("Goal reached! Good job!\n%d steps over the goal!", steps - goal);}
        else {System.out.printf("%d more steps to reach goal.", goal - steps);}
    }
}