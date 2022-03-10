public class Customer {

	private int custID;
	private boolean ID;
	private boolean customCriteria;

	/**
	 * 
	 * @param custID
	 */
	public void setCustID(int custID) {
		this.custID = custID;
	}

	public int getCustID() {
		return this.custID;
	}

	public boolean getID() {
		// TODO - implement Customer.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(boolean ID) {
		// TODO - implement Customer.setID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customCriteria
	 */
	public void setCustomCriteria(boolean customCriteria) {
		this.customCriteria = customCriteria;
	}

	public boolean getCustomCriteria() {
		return this.customCriteria;
	}

	/**
	 * 
	 * @param payment
	 */
	public double makePayment(double payment) {
		// TODO - implement Customer.makePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param failedCriteria
	 */
	public boolean logDenial(String failedCriteria) {
		// TODO - implement Customer.logDenial
		throw new UnsupportedOperationException();
	}

}