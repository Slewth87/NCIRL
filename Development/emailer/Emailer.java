public class Emailer{
    private String[] extens;
    private String email, valid, check, failpoint;
    private StringBuffer strBuff;
    private int count;
    private boolean match;
    //constructor
    public Emailer(){
        valid = "That is not a valid e-mail address.";
        extens = new String[3];
        strBuff = new StringBuffer();
        count = 0;
        match = false;
        failpoint = "None";
    }
    public void setData(String[] extens, String email){
        this.extens = extens;
        this.email = email;
        for (int i = 3;i>0;i--){
            strBuff.append(email.charAt(email.length()-i));
            check = strBuff.toString();
        }
        if (email.charAt(email.length()-4) == '.'){
            for (int i=0;i<3;i++){
                if (check.equalsIgnoreCase(extens[i])){
                    match = true;
                }
            }
            if (match = false){
                failpoint = "Incorrect domain name extension.";
            }
            if (failpoint.equals("None")){
                for (int i=1;i<email.length()-4;i++){
                    if (email.charAt(i) == '@'){
                        count++;
                    }
                }
                if (count != 1 || email.charAt(0) == '@' || email.charAt(email.length()-5) == '@'){
                    failpoint = "Incorrect use of the \'@\' symbol.";
                }
            }
        } else {
            failpoint = "No \'.\' before the domain name extension.";
        }
        if (failpoint.equals("None")){
            valid = email+" is a valid e-mail address.";
        } else {
            valid = email+" is not a valid e-mail address.\n"+failpoint;
        }
    }
    public String validation(){
        return valid;
    }
}