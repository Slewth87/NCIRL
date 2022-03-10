import javax.swing.JOptionPane;

public class LeapYearApp{
    public static void main(String[] args){
        //vars
        int year;
        String msg;
        //object
        LeapYear l;
        l = new LeapYear();
        //input
        year=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the year:"));
        //set
        l.setYear(year);
        //calculate
        l.calculate();
        //get
        msg=l.getLeap();
        //output
        JOptionPane.showMessageDialog(null,year+" is "+msg+"a leap year.");
    }
}