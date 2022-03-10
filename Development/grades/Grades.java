public class Grades{
    //vars
    private int total;
    private String grade;
    //constructor
    public void Grades(){
        total=100;
        grade="A";
    }
    //set
    public void setMark(int total){
        this.total=total;
    }
    //calculate
    public void run(){
        if (total>=90 && total<=100){
            grade="n A";
        } else if (total>=80 && total<90){
            grade=" B";
        } else if (total>=65 && total<80){
            grade=" C";
        } else if (total>=40 && total<65){
            grade=" D";
        } else if (total<40 && total>=0){
            grade="n F";
        } else {
            grade=" fucked up";
        }
    }
    //get
    public String getResult(){
        return grade;
    }
}