package database_classes;

public class Account{
	public String email;
	public String password;

	// constructor
	public Account(String email, String password)
	{
		this.email = email;
		this.password = password;
	}

	public boolean login(String user, String pass){
		if(user == email && pass == password){
			return True;
		}
		return False;
	}

	public string getEmail()
	{
		return this.email;
	}

	public void setEmail(String userEmail)
	{
		this.email = userEmail;
	}

	public string getPassword()
	{
		return this.password;
	}

	public void setPassword(String userPassword)
	{
		this.password = userPassword;
	}
}
