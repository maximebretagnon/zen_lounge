package persistance.data;

import java.util.Date;

public abstract class Member {
    private int number;

    private Date joiningDate;

    Date getJoiningDate() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.joiningDate;
    }

    void setJoiningDate(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.joiningDate = value;
    }

    int getNumber() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.number;
    }

    void setNumber(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.number = value;
    }

    public void save() {
    }

    public void load() {
    }

}
