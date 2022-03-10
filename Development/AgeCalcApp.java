import javax.swing.JOptionPane;
public class AgeCalcApp{
    public static void main(String[] args){
        //variables
        int age;
        int year;
        int bDay;
        int bYear;
        //objects
        AgeCalc old;
        old=new AgeCalc();
        //inputs
        age=Integer.parseInt(JOptionPane.showInputDialog(null,"What  age are you?"));
		year=Integer.parseInt(JOptionPane.showInputDialog(null,"What year is it?"));
        bDay=JOptionPane.showConfirmDialog(null,"Have you had your birthday yet?");        
        //set
        old.setAge(age);
        old.setYear(year);
        old.setBday(bDay);
        //compute
        old.computeByear();
        //get
        bYear=old.getByear();
        //output
        if (bDay == 2){}
        else {
            JOptionPane.showMessageDialog(null,"You were born in "+bYear);
        }
    }
}