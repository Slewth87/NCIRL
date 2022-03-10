import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author rduffy
 */
public class Doors {
    public static void main(String[] args) {
        
        int size;
        int[] groupMembers;
        String pass;
        String customCritName[];
        String customCritDesc[];
        int criterion;
        
        Group grp = new Group();
        grp.setGroupID();
        size = Integer.parseInt(JOptionPane.showInputDialog(null,"How many members in the Group?"));
        grp.setSize(size);
        groupMembers = new int[size];
        
        // The following section is a placeholder for a database lookup to see if there are any custom criteria.
        Random rand = new Random();
        criterion = rand.nextInt(5)-2;  //Random generation for 0-3 criteria, with a 50% chance of there being no custom criteria
        // end placeholder
        
        
        if (criterion > 0) {
            customCritName = new String[criterion];
            customCritDesc = new String[criterion];
            for (int i=0;i<criterion;i++) {

                // The following is a placeholder to lookup details of any Custom Criteria
                customCritName[i] = "Criteria"+(i+1)+" Name";
                customCritDesc[i] = "Criteria"+(i+1)+" Description";
                // End placeholder

            }
        } else {
            customCritName = new String[0];
            customCritDesc = new String[0];
        }
        
        for (int i=0;i<size;i++) {
            Customer cst = new Customer();
            cst.setCustID();
            groupMembers[i] = cst.getCustID();
            pass = JOptionPane.showInputDialog(null, "Does customer "+groupMembers[i]+" have valid ID? (y/n)");
            if (pass == "y") {
                cst.logCust("ID",true);
            } else if (pass == "n") {
                cst.logCust("ID",false);
            }
            if (criterion > 0) {
                for (int j=0;j<criterion;j++) {
                    pass = JOptionPane.showInputDialog(null, "Does the customer meet the following Criteria? (y/n)\n"+customCritName[j]+"\n"+customCritDesc[j]);
                    if (pass == "y") {
                        cst.logCust(customCritName[j],true);
                    } else if (pass == "n") {
                        cst.logCust(customCritName[j],false);
                    }
                }
            }
        }
        grp.logGroup();
    }
}

