package Data.Datas;

public abstract class UserData {
	
	protected String firstName;
	protected String lastName;
	protected String phone;
	protected String mail;
	protected String address;
	protected String login;
	protected String pwd;
	
    public UserData(){
    	this.firstName="";
    	this.lastName="";
    	this.phone="";
    	this.mail="";
    	this.address="";
    	this.login="";
    	this.pwd="";
    }
	
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