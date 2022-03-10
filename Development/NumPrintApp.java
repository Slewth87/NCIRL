import javax.swing.JOptionPane;

public class NumPrintApp{
    public static void main(String[] args) {
        // int odd = 0;
        // int even = 0;
        // for (int n=1;n<=100;n++){
        //     if (n%2==0){
        //         even=n+even;
        //     } else {
        //         odd=n+odd;
        //     }
        // }
        // System.out.println(odd);
        // System.out.println(even);
        // int total = 0;
        // for (int i=1;i<=5;i++){
        //     int input=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number:"));
        //     total = total+input;
        // }
        // System.out.println(total);
        // vars
        int start, end;
        //object
        NumPrint num;
        num = new NumPrint();
        //set
        start=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number:"));
        end=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter another number:"));
        // inc=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an increment number:"));
        num.setStart(start);
        num.setEnd(end);
        // num.setInc(inc);
        num.run();
    }
}