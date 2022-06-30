import java.util.Date;
public class Payment {
	private String id;
	private Date paid;
	private double total;
	private String details;
	private Account Acc;
	private static double idCount=00000;

	
	// Function generate order number
	public static String createID() {		
		return String.valueOf(idCount++);
	};
	
	//Constructor
	public Payment(){
		this.id = createID();
		this.paid = new Date();
		this.total = 0;
		this.details = null;;
		this.Acc = null;
	}
	
	//Parameterized
	public Payment(double t, String d, Account a){
		this.id = createID();
		this.paid = new Date();
		this.total = t;
		this.details = d;
		this.Acc = a;
	}
	
	public String toString() {
		return "Account: " + Acc.toString() + "\n"+"Payment ID: " + id + "\n"+"Paid: " + paid + "\n"+"Total: " + total + "\n"+"Details: " + details;
	}
		
}
