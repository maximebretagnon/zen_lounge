package persistance.data;


public abstract class Speaker {
    private String job;

    private String shortDescription;

    private String longDescription;

    String getLongDescription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.longDescription;
    }

    void setLongDescription(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.longDescription = value;
    }

    String getShortDescription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.shortDescription;
    }

    void setShortDescription(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.shortDescription = value;
    }

    String getJob() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.job;
    }

    void setJob(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.job = value;
    }

    public void save() {
    }

    public void load() {
    }

}
