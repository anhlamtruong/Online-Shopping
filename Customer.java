import java.util.Scanner;
// Customer is inherited from Account, because Customer is basically an account with
//new address, phone number and email.
public class Customer extends Account {
	
	//Attributes 
	private Address address;
	private Phone phone;
	private String email;
	
	
	//Constructor
	public Customer() {
		super();
		this.address=new Address();
		this.phone=new Phone();
		this.email="";
	}
	
	//Parameterized
	public Customer(Address accAdd, Phone ph, String e) {
		super();
		this.address = accAdd;
		this.phone = ph;
		this.email = e;
	}
	
	// Web User customer => use login_id for customer id
	public Customer(String webID, Address accAdd, Phone ph, String e){
		super(webID, accAdd);
		this.phone = ph;
		this.email = e;
	}
	
	// Getting functions
	public String getEmail(){
		return this.email;
	}
	public Phone getPhone(){
		return this.phone;
	}
	
	// Setting functions
	public void setEmail(String e){
		this.email = e;
	}
	public void setPhone(Phone ph){
		this.phone = ph;
	}
	
	// This functions help the web user convert their login_id into user_id
	public WebUser loginByWeb() {
		Scanner s= new Scanner(System.in);
		System.out.println("Username: ");
		String user=s.nextLine();
		System.out.println("Password: ");
		String pass=s.nextLine();
		s.close();
		this.setid(user);
		return new WebUser(user,pass); //Parameterlized from webuser class
	}
	
	// To String Function
	public String toString() {
		return "\n"+ "Customer: " + getID() + "\n" +"Address: " + address + "\n"+"Phone Number: " + getPhone() + "\n"+"Email: " + email + "\n";
	}
}

