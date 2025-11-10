import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    public Controller() {
        System.out.print("enter amount of seconds: ");
        int seconds = sc.nextInt();
        TimerThread timer = new TimerThread(seconds);
        timer.run();
    }
}
