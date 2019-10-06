package lesson5.textAnalyser;

public class LengthAnalyser implements Analyser {
    private int maxLength;

    public LengthAnalyser(int maxLength) {
        this.maxLength = maxLength;
    }

    public boolean analyse(String text) {
        if(text.length() > maxLength) {
            return false;
        }
        return true;
    }
}
