public class Cinema {
    //vars
    private int age, amt, day;
    private double price, total;
    //Constructor
    public Cinema(){
        day=0;
        age=0;
        price=0.0;
        total=0.0;
    }
    //set
    public void setDay(int day){
        this.day=day;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setAmt(int amt){
        this.amt=amt;
    }
    //compute
    public void calculate(){
        if (day==0){
            if (age<18){
                price=8;
            } else {
                price=10.5;
            }
        } else {
            if (age<18){
                price=10;
            } else {
                price=12.5;
            }
        };
    total=price*amt;
    }
    //get
    public double getTotal(){
        return total;
    }
}