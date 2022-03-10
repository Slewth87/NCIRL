public class Stringer {
    //vars
    private String in, out, shake, about, extractor;
    private int let, vowel;
    private StringBuffer strBuff;
    //constructor
    public Stringer() {
        strBuff = new StringBuffer();
        let = 0;
        vowel = 0;
    }
    //set
    public void setIn(String in){
        this.in = in;
        extractor = in.replaceAll("[^a-zA-Z]+", "");
    }
    //calculations
    public void letters(){
        let = extractor.length();
    }
    public void vowels(){
        for (int i=0;i<in.length();i++){
            if (in.charAt(i)=='a' || in.charAt(i)=='A' || in.charAt(i)=='e' || in.charAt(i)=='E' || in.charAt(i)=='i' || in.charAt(i)=='I' || in.charAt(i)=='o' || in.charAt(i)=='O' || in.charAt(i)=='u' || in.charAt(i)=='U'){
                vowel++;
            }
        }
    }
    public void secLet(){
        for (int i=1;i<extractor.length();i=i+2){
            strBuff.append(extractor.charAt(i));
        }
        out = strBuff.toString();
        strBuff = new StringBuffer();
    }
    public void spaces(){
        for (int i=0;i<in.length();i++){
            if (in.charAt(i)==' '){
                strBuff.append(i+"/");
            }
        }
        about = strBuff.toString();
        strBuff = new StringBuffer();
    }
    public void shaken(){
        for (int i=0;i<in.length();i++){
            if (in.charAt(i)=='a' || in.charAt(i)=='A' || in.charAt(i)=='e' || in.charAt(i)=='E' || in.charAt(i)=='i' || in.charAt(i)=='I' || in.charAt(i)=='o' || in.charAt(i)=='O' || in.charAt(i)=='u' || in.charAt(i)=='U'){
                strBuff.append('!');
            } else {
                strBuff.append(in.charAt(i));
            }
        }
        shake = strBuff.toString();
        strBuff = new StringBuffer();
    }
    //gets
    public int getLet(){
        return let;
    }
    public int getVowels(){
        return vowel;
    }
    public String getOut(){
        return out;
    }
    public String getAbout(){
        return about;
    }
    public String getShake(){
        return shake;
    }
}