/*
 id:String{id}
 name:String
 supplier:Supplier
 */
public class Product {
	
	//Attributes 
	private String id;
	private String name;
	private String supplier;
	private static double idCount;
	
	//Constructor
	public Product() {
		this.id = createID();
		this.name = null;
		this.supplier = null;
	}
	
	
	//Parameterized
	public Product(String n, String sup){
		this.id = createID();
		this.name = n;
		this.supplier = sup;
	}
	
	public String toString() {
		return "Product ID: " + id + " Name: " + name + " Supplier: " + supplier+"\n";
	}
	
	// Function generate id
	public static String createID() {
		return String.valueOf(idCount++);
	};
}
