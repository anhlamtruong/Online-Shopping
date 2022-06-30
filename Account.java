import java.util.Date;
public class Account {
	
	//Attributes 
	private String id;
	private Address billing_address;
	private boolean is_closed;
	private Date open;
	private Date closed;
	private ShoppingCart cart;
	private Order[] accOrders;
	private int numSize=0;
	private static double idCount=0;
	
	
	//Constructor
	public Account(){
		this.id = createID();
		this.billing_address = new Address();
		this.is_closed = false;
		this.open = new Date();
		this.cart = new ShoppingCart();
		this.accOrders = new Order[10];
	}
	
	//Parameterlized
	public Account(String web, Address addAcc){
		this.is_closed = false;
		this.open = new Date();
		this.cart = new ShoppingCart();
		this.accOrders = new Order[10];
		this.id = web;
		this.billing_address = addAcc;
	}
	
	//Other functions
	//Getting function
	public String getID() {
		return this.id;
	}
	
	public Address getBilling() {
		return this.billing_address;
	}
	public ShoppingCart getCart(){
		return this.cart;
	}
	public Order[] getOrders(){System.out.println("\n"+"-------------------------------------------------------"+"\n");
	System.out.println("Case 6:\n");
	System.out.println("Add product to shopping cart\n");
		return this.accOrders;
	}
	public int getOrderSize(){
		return this.numSize;
	}
	// Setting Function
	public void setBillingAddress(Address newAd) {
		this.billing_address=newAd;
	}
	public void setid(String newID) {
		this.id=newID;
	}
	
	// Function that assign the cart to this account
	public void AccShoppingCart(ShoppingCart a) {
		this.cart=a;
	}
	
	//Functions that return the items from the lineItems()shopping cart) to the order.
	public Order newOrder() {
		Order createdOrder=new Order();
		createdOrder.cartToOrder(this);
		accOrders[numSize]=createdOrder;
		numSize++;
		return createdOrder;
		
	}
	//To String Functions
	public String toString() {
		return "\n"+ "Account ID: " + id + "\n"+"Address: " + billing_address + "\n"+"Order Size: " + numSize + "\n"+"Account Open Date: " + open + "\n"+"Account Close Date: " + closed + "\n";
	}
	//Accounts closing Function
	public void closeAccount(){
		closed = new Date();
		is_closed = true;
	}
	// Function generate id
	public static String createID() {
		return String.valueOf("User: "+idCount++);
	};
}

