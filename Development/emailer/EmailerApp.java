import javax.swing.JOptionPane;

public class EmailerApp{
    public static void main(String[] args){
        //vars
        String email, valid;
        String [] extens;
        //initialise
        extens = new String[3];
        //objects
        Emailer e;
        e = new Emailer();
        //inputs
        for (int i = 0;i<3;i++){
            extens[i] = JOptionPane.showInputDialog(null, "Enter a 3 character domain name extension e.g \"com\", \"org\", \"net\":");
            while (extens[i].length()!=3){
                extens[i] = JOptionPane.showInputDialog(null, "Try again");
            }
        }
        email = JOptionPane.showInputDialog(null, "Enter an e-mail address:");
        //send for calculation
        e.setData(extens, email);
        valid = e.validation();
        // output
        JOptionPane.showMessageDialog(null,valid);
    }
}