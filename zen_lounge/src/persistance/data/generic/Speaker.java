package persistance.data.generic;


public abstract class Speaker {
	
    private String job;
    private String shortDescription;
    private String longDescription;

    String getLongDescription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.longDescription;
    }

    public  void setLongDescription(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.longDescription = value;
    }

    public String getShortDescription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.shortDescription;
    }

    public void setShortDescription(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.shortDescription = value;
    }

    public String getJob() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.job;
    }

    public  void setJob(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.job = value;
    }

    public abstract String save(String login);

    public abstract void load(String login);

}
