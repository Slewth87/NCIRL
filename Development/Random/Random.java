public class Random {
    //vars
    private int runs, tab;
    private int[] guesses, pc;
    private String[] victory;
    private String msg, endscreen;
    //constructor
    public Random() {
        guesses=new int[30];
        pc=new int[30];
        victory=new String[30];
    }
    //generate number
    public void randomiser(int runs){
        this.runs=runs;
        pc[runs] = ((int) (Math.random() * 5)+1);
    }
    //set
    public void setUserNo(int userNo){
        guesses[runs]=userNo;
    }
    //compute winner, and give the user a point if they got it.
    public void calculate(){
        if (pc[runs] == guesses[runs]){
            msg = "You done it!";
            victory[runs]="Won";
        } else {
            msg = "Nope";
            victory[runs]="Lost";
        }
    }
    //get
    public String getResult(){
        return msg;
    }
    public String getScores(){
        //Calculate final result screen
        endscreen="These were all your guesses:\n\n User | PC  | Result\n---------------\n";
        for (int i=0;i<=runs;i++){
            tab++;
            endscreen = endscreen +("    "+guesses[i]+"   |   "+pc[i]+"  | "+victory[i]+"\n");
            if (tab==3 || victory[i]=="Won"){
                    endscreen = endscreen+"---------------\n";
                    tab=0;
            }
        }
        return endscreen;
    }
}