
public class Account{
	public int accountID;
	public String username;
	public String password;

	public boolean login(String user, String pass){
		if(user == username && pass == password){
			return True;
		}
		return False;
	}
}
