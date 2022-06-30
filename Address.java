//Addition class for Address
public class Address {
	
	//Attributes 
	private String address;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	//Constructor
	public Address(){
		address= "";
		street = "";
		city = "";
		state = "";
		zip = "";
	}
	
	//Parameterized
	public Address(String ad,String str, String ci, String st, String z){
		this.address=ad;
		this.street = str;
		this.city = ci;
		this.state = st;
		this.zip = z;
	}
	
	
	public String toString(){
		if(address==""||street == "") {
			return "*How can I find a person's house with no address :) ?*";
		}else {
			return address+" "+ street + ", " + city + ", " + state + ", " + zip;
		}
	}
}
