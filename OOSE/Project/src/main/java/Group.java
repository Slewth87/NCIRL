import java.util.Random;

public class Group {

	private int size;
	private int groupID;
        
	/**
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	/**
	 * 
	 * @param groupID
	 */
	public void setGroupID() {
            
            // Placeholder for a database lookup the next available integer rather than generating a random one
            Random rand = new Random();
            // End placeholder
            
            groupID = rand.nextInt(9999998+1);
	}

	public int getGroupID() {
		return groupID;
	}

	public boolean logGroup() {
            
            // Placeholder for passing the groupID and size variables to a database and getting a success/fail response
            Random rand = new Random();
            boolean response = rand.nextBoolean();
            // End placeholder
            
            return response;
	}

}