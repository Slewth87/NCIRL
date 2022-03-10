import java.util.Arrays;

public class Battleship{
    //vars
    String[] col = {"A", "B", "C"};
    String[] pastPC;
    int[] row = {1, 2, 3};
    String[][] grid = new String[col.length][row.length];
    String[][] mapGrid = new String[col.length][row.length];
    String map, guess, pcGuess, pcShip, result, ship;
    char conv;
    int convInt, convStr, turnCount;
    //Constructor
    public Battleship(){
        for (int i=0;i<col.length;i++){
            for (int j=0;j<row.length;j++){
                grid[i][j]=col[i]+row[j];
            }
        }
        for (int i=0;i<col.length;i++){
            for (int j=0;j<row.length;j++){
                mapGrid[i][j]=col[i]+row[j];
            }
        }
        pastPC = new String[9];
        turnCount = 0;
        pcShip = grid[((int) (Math.random() * 2))][((int) (Math.random() * 2))];
    }
    //build map
    public String getMap(){
        map="------------\n";
        for (int i=0;i<col.length;i++){
            for (int j=0;j<row.length;j++){
                map=map+"| "+mapGrid[i][j]+" ";
            }
            map=map+"|\n------------\n";
        }
        return map;
    }
    //set
    public void setShip(String ship){
        this.ship = ship;
    }
    public void makeGuess(String guess){
        this.guess = guess;
    }
    //calculate
    public void calcGuess(){
        if (guess.equalsIgnoreCase(pcShip)){
            result="Hit!";
        } else {
            result = "Miss!";
        }
    }
    public void takePCTurn(){
        do {
            pcGuess = grid[((int) (Math.random() * 3))][((int) (Math.random() * 3))];
        } while (Arrays.stream(pastPC).anyMatch(pcGuess::equals));
        pastPC[turnCount] = pcGuess;
        turnCount++;
        if (pcGuess.equalsIgnoreCase(ship)){
            result="Hit!";
        } else {
            result = "Miss!";
        }
    }
    public void updateMap(){
        conv = Character.toUpperCase(guess.charAt(0));
        if (conv=='A'){
            convStr = 0;
        } else if (conv=='B'){
            convStr = 1;
        } else if (conv=='C'){
            convStr = 2;
        }
        convInt = Character.getNumericValue(guess.charAt(1))-1;
        mapGrid[convStr][convInt] = result;
    }
    //get
    public String getResult(){
        return result;
    }
    public String getGuess(){
        return guess;
    }
    public String getPCGuess(){
        return pcGuess;
    }
}