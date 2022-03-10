import java.util.Random;

public class CustomCriteria {

	private String name;
	private String description;
	private boolean passed;
        private boolean response;


	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
        
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
       
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param passed
	 */
	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public boolean getPassed() {
		return passed;
	}

	public boolean storeCriteria() {
            
            // Placeholder for passing the name and description variables to a database and getting a success/fail response
            Random rand = new Random();
            response = rand.nextBoolean();
            // End placeholder
            
            return response;
	}

}