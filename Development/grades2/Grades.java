public class Grades{
    //vars
    private int[] grades, marks, wap;
    private int overall;
    private String[] score;
    private String msg="";
    //constructor
    public void Grades(){

    }
    //set
    public void setGrades(int[] grades){
        this.grades=grades;
        marks=new int[grades.length+1];
    }
    //calculate
    public void goOverall(){
        for (int i=0;i<grades.length;i++){
            marks[i]=grades[i];
            overall=overall+grades[i];
        }
        marks[grades.length]=overall/grades.length;
    }
    public void goScore(){
        score=new String[marks.length];
        for (int i=0;i<marks.length;i++){
            if (marks[i]>=90 && marks[i]<=100){
                score[i]="A";
            } else if (marks[i]>=80){
                score[i]="B";
            } else if (marks[i]>=65){
                score[i]="C";
            } else if (marks[i]>=40){
                score[i]="D";
            } else if (marks[i]<40 && marks[i]>=0){
                score[i]="F";
            } else{
                score[i]="Out of Range";
            }
        }
    }
    //output
    public void finalise(){
        for (int i=0;i<marks.length;i++){
            if (i==grades.length){
                msg=msg+"Total:\n"+marks[i]+"   | "+score[i];
            } else {
            msg=msg+marks[i]+"   | "+score[i]+"\n";
            }
        }
    msg="Result | Grade\n"+msg;
    }
    //get
    public String getFinal(){
        return msg;
    }
}