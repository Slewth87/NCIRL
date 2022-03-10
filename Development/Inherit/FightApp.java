import javax.swing.JOptionPane;

public class FightApp{
    public static void main(String[] args){
        //vars
        int strike=1;
        int impact=0;
        int winning=0;
        //generate a bystander
        Character guy;
        guy = new Character();
        //create our combatants
        Powered hero;
        hero = new Powered();
        Powered villain;
        villain = new Powered();
        //give 'em details
        hero.setName(JOptionPane.showInputDialog(null, "What's your heroes name?"));
        hero.setDemeanour(JOptionPane.showInputDialog(null, "And how would you describe their demeanour? Heroic, defiant, steadfast?"));
        hero.setAbility(JOptionPane.showInputDialog(null, "Are their powers Physical, Super, or Mystical"));
        villain.setName(JOptionPane.showInputDialog(null, "What's should we call your villain?"));
        villain.setDemeanour(JOptionPane.showInputDialog(null, "And their demeanour?"));
        villain.setAbility(JOptionPane.showInputDialog(null, "Are their powers Physical, Super, or Mystical"));
        //let them fight!
        JOptionPane.showMessageDialog(null,hero.getName()+" squares up "+hero.getStance()+".");
        JOptionPane.showMessageDialog(null,villain.getName()+" approaches "+villain.getStance()+".");
        do {
            JOptionPane.showMessageDialog(null,villain.getName()+" strikes "+villain.getAbility());
            strike = (int) (Math.random()*3);
            if (strike != 0){
                JOptionPane.showMessageDialog(null,"It hits "+guy.getName()+"!");
                impact++;
            } else {
                JOptionPane.showMessageDialog(null,hero.getName()+" absorbs the blow.");
            }
            if (impact < 2){
                JOptionPane.showMessageDialog(null,hero.getName()+" strikes "+villain.getName()+" "+hero.getAbility());
                JOptionPane.showMessageDialog(null,villain.getName()+" is hurt!");
                winning++;
            }
        } while (impact < 2 && winning < 3 );
        //result
        if (impact == 2){
            JOptionPane.showMessageDialog(null, "Too many innocents have died.\n"+hero.getName()+" has failed.\n\n"+villain.getName()+" is victorious.");
        } else {
            JOptionPane.showMessageDialog(null, villain.getName()+" has been reduced to steaming pile of bone and viscera.");
            JOptionPane.showMessageDialog(null, "It's honestly kind of disturbing.");
            JOptionPane.showMessageDialog(null, hero.getName()+" has saved the day!");
        }
    }
}