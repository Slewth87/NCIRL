import javax.swing.JOptionPane;

public class NightOutApp{
    public static void main(String[] args){
        //vars
        int year;
        String venue, prog;
        //object
        NightOut p;
        p = new NightOut();
        //set
        year=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your year:"));
        prog=JOptionPane.showInputDialog(null,"Enter your programme code:");
        p.setYear(year);
        p.setProg(prog);
        //compute
        p.calculate();
        //get
        venue=p.getVenue();
        //output
        JOptionPane.showMessageDialog(null,"Party on at "+venue);
    }
}