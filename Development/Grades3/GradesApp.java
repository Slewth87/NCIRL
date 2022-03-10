import javax.swing.JOptionPane;

public class GradesApp{
    public static void main(String[] args){
        //vars
        double[][] marks;
        int subNum, years;
        String msg;
        //initialise
        subNum = 5;
        years = 4;
        marks = new double[years][subNum];
        //object
        Grades g;
        g = new Grades(subNum, years);
        //input
        for (int i=0;i<years;i++){
            for (int j=0;j<subNum;j++){
                marks[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your result for subject "+(j+1)+" in Year "+(i+1)));
            }
        }
        //set
        g.setMarks(marks);
        //calculate
        g.calculate();
        //get
        msg=g.getMsg();
        //output
        JOptionPane.showMessageDialog(null,msg);
    }
}