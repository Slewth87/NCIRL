import javax.swing.JOptionPane;

public class StringerApp {
    public static void main(String[] args){
        //vars
        String in, out, shake, about;
        int let, vowel;
        //object
        Stringer s;
        s = new Stringer();
        //input
        in = JOptionPane.showInputDialog(null,"Gimme a sentence!");
        s.setIn(in);
        //calculate
        s.letters();
        s.vowels();
        s.secLet();
        s.spaces();
        s.shaken();
        //get
        let = s.getLet();
        vowel = s.getVowels();
        out = s.getOut();
        about = s.getAbout();
        shake = s.getShake();
        //output
        JOptionPane.showMessageDialog(null, "Now, from your statement:\n\""+in+"\"\nExperience the splendour of my gibberish!\n--------------------------------------\nLetters: "+let+"\n\nVowels: "+vowel+"\n\nSecond letters: "+out+"\n\nSpace positions: "+about+"\n\nExclamations: "+shake);
    }
}