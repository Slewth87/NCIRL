public class CloakroomAttendant extends employee {

	private boolean cloakroomAccess;

	public boolean getCloakroomAccess() {
		return this.cloakroomAccess;
	}

	/**
	 * 
	 * @param cloakroomAccess
	 */
	public void setCloakroomAccess(boolean cloakroomAccess) {
		this.cloakroomAccess = cloakroomAccess;
	}

	/**
	 * 
	 * @param itemID
	 * @param storageLocation
	 * @param logged
	 */
	public boolean updateCloakroomItem(int itemID, String storageLocation, boolean logged) {
		// TODO - implement CloakroomAttendant.updateCloakroomItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param itemID
	 */
	public String viewCloakroomItem(int itemID) {
		// TODO - implement CloakroomAttendant.viewCloakroomItem
		throw new UnsupportedOperationException();
	}

}