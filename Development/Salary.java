import javax.swing.JOptionPane;

public class Salary{
	public static void main(String[] args){
		// Inputs
		double salary=Double.parseDouble(JOptionPane.showInputDialog(null,"How much do you make per month?"));
		double hours=Double.parseDouble(JOptionPane.showInputDialog(null,"How many hours do you work each week?"));

		//Process
		double annual=salary*12;
		double hourly=annual/(52*hours);

		//Output
		JOptionPane.showMessageDialog(null, "You make €"+String.format("%.2f",annual)+" per year at €"+String.format("%.2f",hourly)+" an hour.");
	}
}