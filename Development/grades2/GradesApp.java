import javax.swing.JOptionPane;

public class GradesApp{
    public static void main(String[] args){
        //vars
        int subNum;
        int[] grades;
        String msg="";
        //object
        Grades g;
        g=new Grades();
        //input
        subNum=Integer.parseInt(JOptionPane.showInputDialog(null,"How many subjects did you take?"));
        grades=new int[subNum];
        for (int i=0;i<(grades.length);i++){
            grades[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter result #"+(i+1)+":"));
        }
        //set
        g.setGrades(grades);
        //calculate
        g.goOverall();
        g.goScore();
        g.finalise();
        //get
        msg=g.getFinal();
        //output
        JOptionPane.showMessageDialog(null,msg);
    }
}