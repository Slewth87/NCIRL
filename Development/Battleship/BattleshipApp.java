import javax.swing.JOptionPane;

public class BattleshipApp{
    public static void main(String[] args){
        //vars
        String map, ship, guess, result, pcGuess, score="";
        //object
        Battleship b;
        b = new Battleship();
        //input player ship location
        map = b.getMap();
        ship = JOptionPane.showInputDialog(null,"Pick a spot to place your Battleship:\n"+map);
        b.setShip(ship);
        while (score==""){
            guess = JOptionPane.showInputDialog(null,"Your ship is at "+ship+".\nGuess where the enemy ship is:\n"+map);
            b.makeGuess(guess);
            //calculate
            b.calcGuess();
            //output
            result = b.getResult();
            JOptionPane.showMessageDialog(null,result);
            b.updateMap();
            map=b.getMap();
            if (result=="Miss!"){
                b.takePCTurn();
                pcGuess = b.getPCGuess();
                result = b.getResult();
                JOptionPane.showMessageDialog(null,"The PC shot at "+pcGuess+"\nA "+result);
                if (result=="Hit!"){
                    score="PC";
                }
            } else {
                score="user";
            }
        }
        if (score=="user"){
            JOptionPane.showMessageDialog(null,"Congratulations! You won.\n"+map);
        } else {
            JOptionPane.showMessageDialog(null,"You lost, like a loser would.");
        }
    }
}