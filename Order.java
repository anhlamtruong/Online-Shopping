/*
 numeber:String{id}
 ordered:Date
 shipped:Date
 ship_to:Address
 status:OrderStatus
 total:Real
 */
import java.util.Date;

public class Order {
	
	
	//Attributes
	private String number;
	private Date ordered;
	private Date shipped;
	private Address ship_to;
	private OrderStatus status;
	private double total;
	
	private LineItem[] lineItems;
	private int numOrder;
	
	//for the payment class
	private Payment[] payment; 
	private int sizePay;
	
	private static double idCount=1210;
	
	// Function generate order number
	public static String createID() {
		return String.valueOf(idCount++);
	};
	
	//Constructor
	public Order(){
		this.number = createID();
		this.ordered = new Date();
		this.status = OrderStatus.New;
		this.numOrder = 0;
		this.lineItems = new LineItem[9999];
		this.payment = new Payment[9999];
	}
	
	//Getting functions
	public String getNumber() {
		return this.number;
	}
	public OrderStatus getStatus() {
		return this.status;
	}
	public double getTotal() {
		return this.total;
	}
	public String getPayment() {
		return this.payment.toString();
	}
	
	
	//Setting OrderStatus functions
	public void setClosed() {
		this.status = OrderStatus.Closed;
	}

	public void setDelivered() {
		this.status = OrderStatus.Delivered;
	}

	public void setHold() {
		this.status = OrderStatus.Hold;
	}

	public void setShipped() {
		this.status = OrderStatus.Shipped;
	}
	
	//Making a shopping cart into an order
	public void cartToOrder(Account a){
		ShoppingCart cart=a.getCart();
		ship_to=a.getBilling();
		for(int i=0;i<cart.getSize();i++) {
			addLineItem(cart.getLineItems()[i]);
		}
	}
	
	//Adding new items
	public void addLineItem(LineItem item){
		lineItems[numOrder] = item;
		numOrder++;
		total += item.getTotal();
	}
	
	//Adding new payment
	public void addPayment(Payment pay){
		payment[sizePay] = pay;
		sizePay++;
	}
	
	//To String Functions
		public String toString() {
			return "\n"+ "ID: " + this.number + "\n"+"Address: " + this.ship_to + "\n"+"Date: " + this.ordered +"\n"+"Total: " + this.total + "\n";
		}
	
}
