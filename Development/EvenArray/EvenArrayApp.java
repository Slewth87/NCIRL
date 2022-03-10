import javax.swing.JOptionPane;

public class EvenArrayApp{
    public static void main(String[] args){
        //vars
        int[] numbers;
        int [] sorted;
        int request;
        //initialise
        numbers = new int[20];
        EvenArray ea;
        ea = new EvenArray();
        //generate numbers;
        for (int i=0;i<numbers.length;i++){
            numbers[i] = ((int) (Math.random()*40)+1);
        }
        //input
        request = Integer.parseInt(JOptionPane.showInputDialog(null, "Press 0 for evens, or 1 for odds:"));
        //send for calculation and return
        sorted = ea.newArray(numbers, request);
        //output
        for (int i=0;i<sorted.length;i++){
            System.out.println(sorted[i]);
        }
    }
}