import java.util.Scanner;

public class Logic {
    private int WPM;
    private float accuracy;
    private float adjustedWPM;

    public int getWPM() {
        return WPM;
    }

    public int findWPM(int time, int symbols){
        return symbols / 5 / time;
    }

    public float calculateAccuracy(float rightSymbols, float wrongSymbols){
       return rightSymbols / wrongSymbols * 100;
    }
    public float calculateAdjustedWPM(){
        return accuracy * WPM;
    }

}
