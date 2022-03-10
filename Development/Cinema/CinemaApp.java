import javax.swing.JOptionPane;

public class CinemaApp{
    public static void main(String[] args){
        //vars
        int age, amt, day;1
        double total;
        String[] options = {"Weekend","Weekday"};
        //objects
        Cinema c;
        c=new Cinema();
        //inputs
        day = JOptionPane.showOptionDialog(null, "When are you going to the cinema?",
        null,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"What  age are you?"));
        amt = Integer.parseInt(JOptionPane.showInputDialog(null,"How many tickets do you want?"));
        //set
        c.setDay(day);
        c.setAge(age);
        c.setAmt(amt);
        //compute
        c.calculate();
        //get
        total=c.getTotal();
        //output
        JOptionPane.showMessageDialog(null,"Total cost of tickets is €"+String.format("%.2f", total));
    }
}