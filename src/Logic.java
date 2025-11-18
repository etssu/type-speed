public class Logic {
    private int WPM;
    private float accuracy;
    private float adjustedWPM;

    public void setWPM(int WPM) {
        this.WPM = WPM;
    }
    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }
    public void setAdjustedWPM(float adjustedWPM) {
        this.adjustedWPM = adjustedWPM;
    }
    // Main functions
    public int findWPM(int time, int symbolCount){
        return symbolCount / 5 / time;
    }

    public float calculateAccuracy(float correctSymbolsCount, float wrongSymbolsCount){
       return correctSymbolsCount / wrongSymbolsCount * 100;
    }

    public float calculateAdjustedWPM(){
        return accuracy * WPM;
    }

    // Symbols Functions
    public int getSymbolsCount(String text){
        return text.length();
    }

    public int getCorrectSymbolsCount(int symbolCount, String userInput, String text){
        int correctSymbolsCount = 0;
        for (int i = 0; i < symbolCount; i++){
            if (userInput.charAt(i) != text.charAt(i)){
                correctSymbolsCount++;
            }
        }
        return correctSymbolsCount;
    }

    public int getWrongSymbolsCount(int symbolCount, int correctSymbolCount){
        return symbolCount - correctSymbolCount;
    }

}
