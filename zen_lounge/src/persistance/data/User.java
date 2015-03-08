package persistance.data;

public abstract class User {
	
	private String firstName;
	private String lastName;
	private String phone;
	private String mail;
	private String address;
	private String login;
	private String pwd;
	
    public User(){
    	this.firstName="";
    	this.lastName="";
    	this.phone="";
    	this.mail="";
    	this.address="";
    	this.login="";
    	this.pwd="";
    }
    
    public abstract String load(String login, String pwd);
    public abstract String save();
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}