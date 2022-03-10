import javax.swing.JOptionPane;
public class OddEvenApp{
    public static void main (String[] args){
        //vars
        int userNo;
        String msg;
        //create objects
        OddEven oe;
        oe = new OddEven();
        //set
        userNo = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a whole number:"));
        oe.setUserNo(userNo);
        //process
        oe.calculate();
        //get
        msg = oe.getMsg();
        //output
        JOptionPane.showMessageDialog(null,msg);
    }
}