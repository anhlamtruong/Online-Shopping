//Addition class for Address
public class Phone {
	private String Code; // Ex: (510)-***-****
	private String n1;   
	private String n2;
	
	//Constructor
	public Phone(){
		this.Code = "";
		this.n1 = "";
		this.n2 = "";
	}
	//Parameterized
	public Phone(String c, String n1, String n2) {
		this.Code = c;
		this.n1 = n1;
		this.n2 = n2;
	}
	public String toString() {
		return Code + "-" + n1 + "-" + n2;
	}
}
