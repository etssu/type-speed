import java.util.Scanner;

public class Controller {
    String originalText = "With the growth of modern technologies, countries have been increasingly tempted by the use of surveillance tools to monitor or intercept communications. The situation in Bangladesh has been no different, especially during the authoritarian rule of Awami League. As per a report by The Daily Star, between 2016 and 2024, the National Telecommunications Monitoring Centre (NTMC), police, and Rab collectively purchased surveillance equipment worth over Tk 1,382 crore. The legality of using such equipment has always been a hotly debated topic, and the risks in countries like Bangladesh, with poor safeguards and rights records, are particularly dire."
    ;
    String enteredText;
    Scanner sc = new Scanner(System.in);
    Logic logic = new Logic();

    public Controller() {
        System.out.print("enter amount of seconds: ");
        int seconds = sc.nextInt();
        TimerThread timer = new TimerThread(seconds);
        timer.run();

        timer.startTimer();
        while (!timer.isTimeUp()){
            System.out.println(originalText);
            System.out.print("Start: ");
            enteredText = sc.nextLine();
        }

        timer.stopTimer();

        // long elapsedTime = timer.getElapsedTime();
        int symbols = logic.getSymbolsCount(originalText);
        int correctSymbols = logic.getCorrectSymbolsCount(symbols, enteredText, originalText);
        int WPM = logic.findWPM(seconds, logic.getSymbolsCount(enteredText));
        float accuracy = logic.calculateAccuracy(correctSymbols, logic.getWrongSymbolsCount(symbols, correctSymbols));
        float adjustedWPM = logic.calculateAdjustedWPM();

        System.out.println("WPM: " + WPM);
        System.out.println("Accuracy: " + accuracy);
        System.out.println("Adjusted WPM: " + adjustedWPM);
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
//System.out.println("total time: " + elapsedTime / 100 + " seconds"); // print time
