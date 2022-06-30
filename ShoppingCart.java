// created: Date
import java.util.Date;

public class ShoppingCart {
	//Attributes
	private Date created;
	private int cartSize;
	private LineItem[] lineI;
	
	//Constructor
	public ShoppingCart() {
		this.created = new Date();
		this.lineI = new LineItem[100];
		this.cartSize = 0;
	}
	
	//Getting Function.
	public LineItem[] getLineItems() {
		return this.lineI;

	}
	
	public int getSize() {
		return this.cartSize;
	}
	
	//Add items in the Shopping Cart
	public void addLineItem(LineItem i){
		this.lineI[cartSize] = i;
		this.cartSize++;
	}
	
	//Empty the cart
	public void emptyCart(){
		this.cartSize = 0;
		this.lineI = new LineItem[100];
	}
	
}
