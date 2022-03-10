public class employee {

	private String name;
	private int empID;
	private String password;
	public String empName;
	public int socSec;
	public String email;

	public String getName() {
		return this.name;
	}

	public int getEmpID() {
		return this.empID;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param empID
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 
	 * @param transactionID
	 */
	public String viewTransaction(int transactionID) {
		// TODO - implement employee.viewTransaction
		throw new UnsupportedOperationException();
	}

}