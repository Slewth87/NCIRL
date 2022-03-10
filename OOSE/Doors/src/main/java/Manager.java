public class Manager extends employee {

	private boolean adminAccess;

	public boolean getAdminAccess() {
		return this.adminAccess;
	}

	/**
	 * 
	 * @param adminAccess
	 */
	public void setAdminAccess(boolean adminAccess) {
		this.adminAccess = adminAccess;
	}

	public int createEmployee() {
		// TODO - implement Manager.createEmployee
		throw new UnsupportedOperationException();
	}

	public int createCustomCriteria() {
		// TODO - implement Manager.createCustomCriteria
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param empID
	 */
	public String viewEmployee(int empID) {
		// TODO - implement Manager.viewEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public String viewCustomCriteria(String name) {
		// TODO - implement Manager.viewCustomCriteria
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param empID
	 * @param name
	 * @param password
	 * @param role
	 */
	public boolean updateEmployee(int empID, String name, String password, String role) {
		// TODO - implement Manager.updateEmployee
		throw new UnsupportedOperationException();
	}

}