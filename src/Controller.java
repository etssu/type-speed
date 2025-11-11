import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    public Controller() {
        System.out.print("enter amount of seconds: ");
        int seconds = sc.nextInt();
        TimerThread timer = new TimerThread(seconds);
        timer.run();

        timer.startTimer();
        // add main logic here
            // while !isTimeUp:
                // print original text
                // get user input

        timer.stopTimer();
        // print elapsed time
        // print wpm, accuracy, adjusted wpm

    }
}
// Notes
/* ask for time (30 or 60 seconds)
* print mode and time + buttons "start" and "cancel"
* start the test, then check "isTimeUp"
* if !isTimeUp -> continue getting user input
* if isTimeUp -> stop the timer, print elapsed time, wpm, accuracy and adjusted wpm
* print the menu:
*   - play again
*   - save results
*   - quit
* */
