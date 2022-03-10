import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class GameOn{
    public static void main(String[] args){
        //vars
        int choice;
        String game, opener, r0, r1, r2, r3, r4, ending0, ending1, ending2, ending3, ending4, ending5;
        ImageIcon icon;
        String[] options0;
        String[] options1;
        String[] options2;
        String[] options3;
        String[] options4;
        String[] options5;
        //Load game details
        KobayashiMaru g;
        g = new KobayashiMaru();
        game = g.getTitle();
        icon = g.getIcon();
        opener=g.getOpener();
        options0=g.o0();
        options1=g.o1();
        options2=g.o2();
        options3=g.o3();
        options4=g.o4();
        options5=g.o5();
        r0=g.r0();
        r1=g.r1();
        r2=g.r2();
        r3=g.r3();
        r4=g.r4();
        ending0=g.ending0();
        ending1=g.ending1();
        ending2=g.ending2();
        ending3=g.ending3();
        ending4=g.ending4();
        ending5=g.ending5();
        //Game engine
        choice = JOptionPane.showOptionDialog(null,opener,game,JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icon, options0, options0[0]);
        if (choice==0){
            JOptionPane.showMessageDialog(null,ending0,game,JOptionPane.ERROR_MESSAGE, icon);
        } else  {
            choice = JOptionPane.showOptionDialog(null,r0,game,JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, icon, options1, options1[0]);
            if (choice==0){
                choice = JOptionPane.showOptionDialog(null,r1,game,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options2, options2[0]);
                if (choice==0){
                    JOptionPane.showMessageDialog(null,ending1,game,JOptionPane.ERROR_MESSAGE, icon);
                } else  {
                    choice = JOptionPane.showOptionDialog(null,r2,game,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options3, options3[0]);
                    if (choice==0){
                        JOptionPane.showMessageDialog(null,ending2,game,JOptionPane.ERROR_MESSAGE, icon);
                    } else {
                        choice = JOptionPane.showOptionDialog(null, r3,game,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options4, options4[0]);
                        if (choice==0){
                            choice = JOptionPane.showOptionDialog(null, r4,game,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options5, options5[0]);
                            if (choice==0){
                                JOptionPane.showMessageDialog(null,ending3,game,JOptionPane.ERROR_MESSAGE, icon);
                            } else {
                                JOptionPane.showMessageDialog(null,ending4,game,JOptionPane.ERROR_MESSAGE, icon);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null,ending5,game,JOptionPane.ERROR_MESSAGE, icon);
                        }
                    }
                }
            } else {
                choice = JOptionPane.showOptionDialog(null, r3,game,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options4, options4[0]);
                if (choice==0){
                    choice = JOptionPane.showOptionDialog(null, r4,game,JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options5, options5[0]);
                    if (choice==0){
                        JOptionPane.showMessageDialog(null,ending3,game,JOptionPane.ERROR_MESSAGE, icon);
                    } else {
                        JOptionPane.showMessageDialog(null,ending4,game,JOptionPane.ERROR_MESSAGE, icon);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,ending5,game,JOptionPane.ERROR_MESSAGE, icon);
                }
            }
        }
    }
}