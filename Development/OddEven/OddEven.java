public class OddEven {
    //vars
    private int userNo;
    private String msg;
    //constructor
    public OddEven(){
        userNo = 0;
        msg = "odd";
    }
    //set
    public void setUserNo(int userNo){
        this.userNo = userNo;
    }
    //compute
    public void calculate(){
        if (userNo % 2 == 0){
            msg = "Even";
        } else {
            msg = "odd";
        };
    }
    //get
    public String getMsg(){
        return msg;
    }
}