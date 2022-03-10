public class LeapYear{
    //vars
    private int year;
    private String msg;
    //constructor
    LeapYear(){
        year=1900;
        msg="not ";
    }
    //set
    public void setYear(int year){
        this.year=year;
    }
    //compute
    public void calculate(){
        if (year%400==0 || (year%100!=0 && year%4==0)){
            msg="";
        }
    }
    //get
    public String getLeap(){
        return msg;
    }
}