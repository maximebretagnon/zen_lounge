package persistance.data.generic;

public abstract class Administrator {

	private String user;

	public void setUser(String userAdmin) {
		user = userAdmin;
	}

	public String getUser() {
		return user;
	}
}