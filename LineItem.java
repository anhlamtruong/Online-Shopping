/*
 quantity:Interger
 price:Price
 *{ordered,unique}
 */
public class LineItem {
	
	//Attributes
	private int quantity;
	private double price;
	private Product product;
	
	//Constructor
	public LineItem(){
		this.quantity = 0;
		this.price = 0;
		this.product = null;
	}
	
	
	//Parameterized
	public LineItem(int q, double p, Product pro){
		this.quantity = q;
		this.price = p;
		this.product = pro;
	}
	
	//Getting functions
	public double getPrice(){
		return this.price;
	}

	public int getQuantity(){
		return this.quantity;
	}
	
	//Get total for the order class
	public double getTotal(){         
		return this.price * this.quantity;
	}
	
	
	public String toString() {
		return "Product: " + product.toString() + "\n"+"Quantity: " + quantity + "\n"+"Price: " + price + "\n"+"Total: " + getTotal()+"\n";
	}
}
