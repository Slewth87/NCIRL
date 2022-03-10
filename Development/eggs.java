import javax.swing.JOptionPane;

public class eggs{
	public static void main(String[] args){
        // Input
        int eggs=Integer.parseInt(JOptionPane.showInputDialog(null,"How many eggs were laid?"));
        // Calculations
        int boxes=eggs/6;
        int spares=eggs%6;
        // Output
        JOptionPane.showMessageDialog(null, "You'll need "+boxes+" egg boxes and will have "+spares+" eggs left over.");
	}
}