public class Grades{
    //vars
    private double marks[][];
    private double tot;
    private double avg[];
    private String msg, grade;
    private int subNum, years;
    //constructor
    public Grades(int subNum, int years){
        msg="Your results are:\n";
        this.subNum = subNum;
        this.years = years;
        avg = new double[years+1];
    }
    //set
    public void setMarks(double[][] marks){
        this.marks = marks;
    }
    //calculate
    public void calculate(){
        for (int i=0;i<years;i++){
            tot=0;
            msg=msg+"Year "+(i+1)+":\n";
            for (int j=0;j<subNum;j++){
                grade=getGrade(marks[i][j]);
                msg=msg+"Subject #"+(j+1)+": "+marks[i][j]+"% : "+grade+"\n";
                tot = tot+marks[i][j];
            }
            avg[i] = tot/subNum;
            grade=getGrade(avg[i]);
            msg = msg+"------------------------\nYear "+(i+1)+" Average: "+String.format("%.2f", avg[i])+"% : "+grade+"\n------------------------\n------------------------\n";
        }
        tot=0;
        for (int i=0;i<years;i++){
            tot=tot+avg[i];
        }
        avg[avg.length-1] = tot/years;
        grade=getGrade(avg[avg.length-1]);
        msg=msg+"Overall average: "+String.format("%.2f", avg[avg.length-1])+"% : "+grade;
    }
    //get
    public String getMsg(){
        return msg;
    }

    //grader
    private String getGrade(double score){
        if (score<=100 && score>=90){
            grade = "A";
        } else if (score<90 && score>=80){
            grade = "B";
        } else if (score<80 && score>=65){
            grade = "C";
        } else if (score<65 && score>=40){
            grade = "D";
        } else if (score<40 && score>=0){
            grade = "F";
        } else {
            grade = "Out of range";
        }
        return grade;
    }
}