import javax.swing.ImageIcon;

public class KobayashiMaru {
    //vars
    private String game, opener, r0, r1, r2, r3, r4, ending0, ending1, ending2, ending3, ending4, ending5;
    private int kirksExit;
//I couldn't figure out how to establish arrays or an icon in a constructor. But seeing as we haven't covered these yet, I decided to let myself away with setting them here.
    final ImageIcon icon = new ImageIcon("trek.png");
    private String[] options0={"Leave them", "Attempt a rescue"};
    private String[] options1={"Hail them", "Prepare for Combat"};
    private String[] options2 = {"Surrender", "Cut transmission"};
    private String[] options3 = {"Inspire with a speech", "Throw the ensign in the brig"};
    private String[] options4 = {"Raise Shields", "Open Fire!"};
    private String[] options5 = {"Flee!", "Open Fire!"};
    //constructor
    public KobayashiMaru(){
        // kirksExit=1;
        game="The Kobayashi Maru";
        opener="The civilian freighter, Kobayashi Maru, is stranded in the Klingon neutral zone, with no power.\nYou are the only vessel in range.\nIf you enter the neutral zone, it could trigger a diplomatic incident with the Klingons.\n\nWhat do you do?";
        r0="You make your way into the neutral zone, anxiously watching your ship's scanners.\nSuddenly, three Klingon Warbirds decloak, surrounding your ship.\n\nWhat do you do?";
        r1="The Klingons demand your immediate surrender.\n\nWhat do you do?";
        r2="Your crew are terrified of the Klingon threat.\nAn ensign stands up demanding that you re-open comms to negotiate the safety of the crew.\nThe ensign is becoming belligerent.\n\nWhat do you do?";
        r3="Your crew swing into action, readying battlestations.\nWhat are your orders?";
        r4="With your defenses raised, you have some hope of surviving the next few moments.\n\nWhat do you do?";
        ending0="You leave the Kobayashi Maru to its fate.\n\nOn scanners you pick up several Klingon Warbirds approaching the ship. They destroy it, and all 43 souls on board are lost.";
        ending1="You acquiesce to the Klingon's demands. Lowering your shields and allowing them to board your ship.\nThey round up your crew and execute them.\n\nYou lose.";
        ending2="You give an inspiring speech to your crew. The troops are rallied, and are prepared to do battle.\nWhile you were speaking, the Klingons opened fire.\nYour ship is destroyed with the loss of all hands.\n\nYou lose.";
        ending3="You turn to flee the encounter. As you power up the warp drive, the Warbirds open fire.\nThe first few photon torpedoes deplete your shields.\nThe remaining torpedoes destroy your ship.\n\nYou lose.";
        if (kirksExit==1){
            ending4="Your spread of torpedoes wipes out the Klingon Warbirds.\n\nCongratulations, you win!";
        } else {
            ending4="You open fire on the Klingon Warbirds. The Warbirds return fire.\nYour opening volley destroys one of the Warbirds before your shields are depleted and your ship is destroyed.\n\nYou lose.";
        }
        if (kirksExit==1){
            ending5="Your spread of torpedoes wipes out the Klingon Warbirds.\n\nCongratulations, you win!";
        } else {
            ending5="You open fire on the Klingon Warbirds. The Warbirds return fire.\nBefore you've gotten off enough torpedoes to deplete the shields of even one of their ships, your own ship is destrroyed.\n\nYou lose.";
        }
    }
    //get methods to load the game to the launcher
    public ImageIcon getIcon(){
        return icon;
    }
    public String getTitle(){
        return game;
    }
    public String getOpener(){
        return opener;
    }
    public String r0(){
        return r0;
    }
    public String r1(){
        return r1;
    }
    public String r2(){
        return r2;
    }
    public String r3(){
        return r3;
    }
    public String r4(){
        return r4;
    }
    public String[] o0(){
        return options0;
    }
    public String[] o1(){
        return options1;
    }
    public String[] o2(){
        return options2;
    }
    public String[] o3(){
        return options3;
    }
    public String[] o4(){
        return options4;
    }
    public String[] o5(){
        return options5;
    }
    public String ending0(){
        return ending0;
    }
    public String ending1(){
        return ending1;
    }
    public String ending2(){
        return ending2;
    }
    public String ending3(){
        return ending3;
    }
    public String ending4(){
        return ending4;
    }
    public String ending5(){
        return ending5;
    }
}