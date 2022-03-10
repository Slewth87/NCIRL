public class NumPrint{
    //vars
    private int start, end, running;
    //Constructor
    public void NumPrint(){
        start=0;
        end=0;
        // inc=1;
    }
    //set
    public void setStart(int start){
        this.start=start;
    }
    public void setEnd(int end){
        this.end=end;
    }
    // public void setInc(int inc){
    //     this.inc=inc;
    // }
    //calculate
    public void run(){
        running=start;
        // if (end>start){
            for (int n=end;n>1;n--){
                running=running*start;
            System.out.println(running);
            }
        // } else {
        //     for (int n=start;n>=end;n=n-inc){
        //         System.out.println(n);
        //     }
        // }
    }
}