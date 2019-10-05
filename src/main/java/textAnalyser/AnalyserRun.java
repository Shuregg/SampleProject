package textAnalyser;

public class AnalyserRun {
    public static void main(String[] args) {
        LengthAnalyser lengthAnalyser = new LengthAnalyser(200);
        SpamAnalyser spamAnalyser = new SpamAnalyser(new String[] {"кредит", "микрозайм"});
        SwearAnalyser swearAnalyser = new SwearAnalyser();
        Analyser[] analysers = new Analyser[3];
        analysers[0] = new LengthAnalyser(200);
        analysers[1] = new SpamAnalyser(new String[] {"кредит", "микрозайм"});
        analysers[2] = new SwearAnalyser();
        String text = "I fuck you, микрозайм";
        /*
        System.out.println(lengthAnalyser.analyse(text));
        System.out.println(spamAnalyser.analyse(text));
        System.out.println(swearAnalyser.analyse(text));
        */
        int count = 0;
        boolean readyText;
        for (int i = 0; i < analysers.length; i++) {
            System.out.println(analysers[i].analyse(text));
            if(analysers[i].analyse(text) == true){
                count++;
            }
        }
        if(count == analysers.length) {
            readyText = true;
        } else {
            readyText = false;
        }

    }
}
