public class Cashier extends employee {

	private boolean posAccess;

	public boolean getPosAccess() {
		return this.posAccess;
	}

	/**
	 * 
	 * @param posAccess
	 */
	public void setPosAccess(boolean posAccess) {
		this.posAccess = posAccess;
	}

	public int createTransaction() {
		// TODO - implement Cashier.createTransaction
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param transactionID
	 * @param price
	 * @param cloakroomUsers
	 */
	public boolean updateTransaction(int transactionID, double price, int cloakroomUsers) {
		// TODO - implement Cashier.updateTransaction
		throw new UnsupportedOperationException();
	}

}