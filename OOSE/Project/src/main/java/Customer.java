import java.util.Random;

public class Customer {

    private int custID;
    private boolean ID;
    private boolean customCriteria;
    private double balance;
    private boolean response;

    public void setCustID() {

        // Placeholder for a database lookup the next available integer rather than generating a random one
        Random rand = new Random();
        custID = rand.nextInt(9999998+1);
        // End placeholder

    }

    public int getCustID() {
        return custID;
    }

    public void setID(boolean ID) {
        this.ID = ID;
        logCust("ID",ID);
    }

    public boolean getID() {
        return ID;
    }

    public void setCustomCriteria(boolean customCriteria) {
        this.customCriteria = customCriteria;
        logCust("Custom",customCriteria);
    }

    public boolean getCustomCriteria() {
        return this.customCriteria;
    }

    public String viewCustomer(int custID) {
        boolean idStatus = false;
        double bal = 0.00;
        boolean customStatus = false;
        getCustID();
        if (ID) {
            idStatus = true;
        }
        if (balance != 0.00) {
            bal = balance;
        }
        if (customCriteria) {
            customStatus = true;
        }
        String details = "CustID: "+this.custID+"\nID: "+idStatus+"\nCustom Criteria: "+customStatus+"\nBalance: €"+bal;
        return details;
    }

    public double makePayment(double payment, double owed) {

        // Placeholder for running an interaction with a separate POS System here
        balance = ((owed*100)-(payment*100))/100;
        // End placeholder

        return balance;
    }

    public boolean logCust(String criteria, boolean passFail) {

        // Placeholder for passing the criteria, passFail and custID variables to a database and getting a success/fail response
        Random rand = new Random();
        response = rand.nextBoolean();
        // End placeholder

        return response;
    }
}