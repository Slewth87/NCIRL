public class OddEven {
    //vars
    private String msg;

    public String calculate(int userNo){
        if (userNo % 2 == 0){
            msg = "Even";
        } else {
            msg = "Odd";
        }
        return msg;
    }
}