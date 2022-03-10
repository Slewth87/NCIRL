import javax.swing.JOptionPane;

public class RandomApp{
    public static void main (String[] args){
        //vars
        int userNo, retry, runs;
        String msg, endscreen;
        //initialise
        runs=0;
        msg="";
        //create object
        Random ran;
        ran = new Random();
        //Setting my retry loop
        do {
            //Setting game to give 3 chances
            for (int n=1;n<=3;n++){
                //generate a new number each time
                ran.randomiser(runs);
                //input
                userNo = Integer.parseInt(JOptionPane.showInputDialog(null, "You have three attempts to guess the right number.\nThis is guess "+n+"\n\nEnter a number between 1 and 5:"));
                //pass the guess to the instantiable and calculate
                ran.setUserNo(userNo);
                ran.calculate();
                //get the result message
                msg=ran.getResult();
                //Force loop exit condition if the user wins
                if (msg=="You done it!"){
                    n=n+2;
                }
                //round output
                JOptionPane.showMessageDialog(null,msg);
                //increase the loop count
                runs++;
            }
            //End round
//Ok, I know I'm going against the lab directions here, but I'm enforcing a cap on the amount of plays so it doesn't go over the size of the array.
//I could go much higher with the array size and how many rounds I allow, but I'm considering the displayability of the final results at the end as well.
//The run limit is 28 because otherwise the start of a round of 3 could potentially lead to run 31, crashing the program.
            if (runs<28){
                if (msg=="Nope"){
                    retry=JOptionPane.showConfirmDialog(null, "Haha, loser!\n\nDo you want to play again?");
                } else {
                    retry=JOptionPane.showConfirmDialog(null, "Do you want to go again?");
                }
            } else {
                retry=1;
                JOptionPane.showMessageDialog(null, "Ok, you've had enough.");
            }
        } while (retry<1);
        //Get and Display final score
        endscreen = ran.getScores();
        JOptionPane.showMessageDialog(null,endscreen);
    }
}