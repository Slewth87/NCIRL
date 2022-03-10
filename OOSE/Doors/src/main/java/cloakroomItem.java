public class cloakroomItem {

	private int itemID;
	private String storageLocation;
	private boolean logged;

	public int getItemID() {
		return this.itemID;
	}

	/**
	 * 
	 * @param itemID
	 */
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getStorageLocation() {
		return this.storageLocation;
	}

	/**
	 * 
	 * @param storageLocation
	 */
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public boolean getLogged() {
		return this.logged;
	}

	/**
	 * 
	 * @param logged
	 */
	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public int createDocket() {
		// TODO - implement cloakroomItem.createDocket
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param itemID
	 * @param storageLocation
	 * @param docketID
	 * @param logged
	 */
	public void logItem(int itemID, String storageLocation, int docketID, boolean logged) {
		// TODO - implement cloakroomItem.logItem
		throw new UnsupportedOperationException();
	}

}