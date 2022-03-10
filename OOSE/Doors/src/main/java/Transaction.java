public class Transaction {

	private double price;
	private boolean paid;
	private int transactionID;
	private int cloakroomUsers;

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getPaid() {
		return this.paid;
	}

	/**
	 * 
	 * @param paid
	 */
	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public int getTransactionID() {
		return this.transactionID;
	}

	/**
	 * 
	 * @param transactionID
	 */
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getCloakroomUsers() {
		return this.cloakroomUsers;
	}

	/**
	 * 
	 * @param cloakroomUsers
	 */
	public void setCloakroomUsers(int cloakroomUsers) {
		this.cloakroomUsers = cloakroomUsers;
	}

	public int createTicket() {
		// TODO - implement Transaction.createTicket
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param transactionID
	 * @param groupID
	 * @param price
	 * @param paid
	 * @param groupSize
	 * @param cloakroomUsers
	 * @param empID
	 */
	public boolean logTransaction(int transactionID, int groupID, double price, boolean paid, int groupSize, int cloakroomUsers, int empID) {
		// TODO - implement Transaction.logTransaction
		throw new UnsupportedOperationException();
	}

}