public class AgeCalc{
    //vars
    private int age;
    private int year;
    private int bDay;
    private int bYear;
    //set
    public void setAge(int age){
        this.age=age;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setBday(int bDay){
        this.bDay=bDay;
    }
    //compute
    public void computeByear(){
        this.bYear=year-age-bDay;
    }
    //get
    public int getByear(){
        return bYear;
    }
}