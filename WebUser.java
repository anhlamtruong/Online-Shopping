/* Web User => Customer => Account 
 * Subclass => Subclass =>Superclass 
 * login_id:String{id}
 * password:String
 * state:UserState                
 */
public class WebUser extends Customer { //Got inherited
	//Attributes
	private String login_id;
	private String password;
	private UserState state;
	
	//Constructor
	public WebUser(){
		super();
		this.login_id = "";
		this.password = "";
		this.state = UserState.New;
	}
	
	//Parameterized
	public WebUser(String login, String pass){
		super();
		this.login_id = login;
		this.password = pass;
		this.state = UserState.New;
	}
	
	//Getting function
	public UserState getState() {
		return this.state;
	}
	
	//Setting function
	public void setActive() {
		this.state = UserState.Active;
	}
	
	public void setBlocked() {
		this.state = UserState.Blocked;
	}
	
	public void setBanned() {
		this.state = UserState.Banned;
	}
	
	public void setPassword(String pw){
		this.password = pw;
	}
	
	//ToString function
	public String toString(){
		return "Web User ID: " + login_id + "\n"+"User State: " + state+"n";
	}
}
