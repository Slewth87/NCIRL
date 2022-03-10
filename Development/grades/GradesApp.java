import javax.swing.JOptionPane;

public class GradesApp{
    public static void main(String[] args){
        //vars
        int subjects, mark=0, total=0;
        String msg, grade;
        //object
        Grades g;
        g = new Grades();
        //set
        subjects=Integer.parseInt(JOptionPane.showInputDialog(null, "How many subjects did you take?"));
        for (int n=1;n<=subjects;n++){
            mark=mark+Integer.parseInt(JOptionPane.showInputDialog(null, "What mark did you get in Subject "+n+"?"));
            total=mark/subjects;
        }
        g.setMark(total);
        //calculate
        g.run();
        //get
        grade=g.getResult();
        //output
        JOptionPane.showMessageDialog(null, "Your overall mark was "+total+"%\nThis gives you a"+grade+" grade.");
    }
}