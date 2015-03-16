package persistance.data.generic;


public abstract class Inscription {
    private String state;

    String getState() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.state;
    }

    void setState(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.state = value;
    }

    public void save() {
    }

    public void load() {
    }

	public void save(String userID, String chosenEvent) {
		// TODO Auto-generated method stub
		
	}

}
