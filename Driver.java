//This will be the test of the year!
public class Driver {
	public static void main(String[] args){
		BlackBox();
	}
	
	//WHITE BOX FUNCTION
	public static void WhiteBox() {
		//WHITE BOX TEST
		System.out.println("-----------------" +"\n "
						+ "WHITE BOX TEST:"+"\n"+"---------------"+"\n");
				
		//Account a_1 is the new account, haven't added any kinds of address or Id
		//Account a_2 is the web id account, will have address "add1" and Web_ User ID
				
		System.out.println("Creating 2 Accounts...\n");
				
		Account a_1=new Account();
		Address add1 = new Address("24401","EdgeBrook Drive", "Hayward", "CA", "95451");
		Address add2 = new Address("1234","AnhLamTruong Drive", "NewYork", "NY", "19672");
		Account a_2 = new Account("00002", add2);
		//Print out to see what happen a_1
		System.out.println(a_1.toString());
				
		//Print out to see what happen a_2
		System.out.println(a_2.toString());
			
		System.out.println("Get id for account a_1...\n");
		a_1.setid("00001");
				
		//Check if the ID work fine with the 
		System.out.println("a_1 getting ID: " + a_1.getID());
		System.out.println("a_2 getting ID " + a_2.getID());
				
		System.out.println("Adding Billing address for account a_1...\n");
		a_1.setBillingAddress(add1);
				
			//Print out to see what happen a_1
		System.out.println(a_1.toString());
						
			//Print out to see what happen a_2
		System.out.println(a_2.toString());
				
		//Check if the function closed work or not
		a_2.newOrder();
		System.out.print("This a_2 cart:"+a_2.getCart()+"\n");
		System.out.print("This a_2 cart:"+a_2.getOrderSize()+"\n");
		System.out.println("Closing account a_1...\n");
		a_1.closeAccount();
				
		//Print out to see what happen a_1
		System.out.println(a_1.toString());
								
		//Print out to see what happen a_2
		System.out.println(a_2.toString());
	}
	public static void BlackBox() {
		System.out.println("-----------------" +"\n "
				+ "BLACK BOX TEST:"+"\n"+"---------------"+"\n");
		System.out.println("Case 1:\n");
		System.out.println("Creating 10 Accounts...\n");
		Account a1=new Account();
		Account a2=new Account();
		Account a3=new Account();
		Account a4=new Account();
		Account a5=new Account();
		Account a6=new Account();
		Account a7=new Account();
		Account a8=new Account();
		Account a9=new Account();
		Account a10=new Account();
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		System.out.println(a6.toString());
		System.out.println(a7.toString());
		System.out.println(a8.toString());
		System.out.println(a9.toString());
		System.out.println(a10.toString());
		
		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 2:\n");
		System.out.println("Setting Billing address for account 0 1 2\n");
		Address add1 = new Address("24401","EdgeBrook Drive", "Hayward", "CA", "95451");
		Address add2 = new Address("1234","AnhLamTruong Drive", "NewYork", "NY", "19672");
		Address add3 = new Address("1","Rock Drive", "Lord of Rings", "PA", "19406");
		a1.setBillingAddress(add1);
		a2.setBillingAddress(add2);
		a3.setBillingAddress(add3);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 3:\n");
		System.out.println("Close account 9\n");
		a10.closeAccount();
		System.out.println(a10.toString());
		
		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 4:\n");
		System.out.println("Create 5 products\n");
		Product product1=new Product("Mac","Apple");
		Product product2=new Product("ROG Phone","Asus");
		Product product3=new Product("Alien Ware","Dell");
		Product product4=new Product("Galaxy S20","Samsung");
		Product product5=new Product("Anh Lam Truong","My Mom");
		System.out.println(product1.toString());
		System.out.println(product2.toString());
		System.out.println(product3.toString());
		System.out.println(product4.toString());
		System.out.println(product5.toString());
		
		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 5:\n");
		System.out.println("Line Items\n");
		LineItem line1=new LineItem(10,1000,product1);
		LineItem line2=new LineItem(1345,10.2,product2);
		LineItem line3=new LineItem(2345,87.34,product3);
		LineItem line4=new LineItem(11,65000,product4);
		LineItem line5=new LineItem(9,100,product5);

		System.out.println(line1.toString());
		System.out.println(line2.toString());
		System.out.println(line3.toString());
		System.out.println(line4.toString());
		System.out.println(line5.toString());

		
		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 6:\n");
		System.out.println("Add product to shopping cart\n");
		ShoppingCart cart1=new ShoppingCart();
		cart1.addLineItem(line1);
		cart1.addLineItem(line2);
		cart1.addLineItem(line3);
		cart1.addLineItem(line4);
		cart1.addLineItem(line5);

		System.out.println("How big is the cart 1: "+cart1.getSize());
		
		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 7:\n");
		System.out.println("Transfer from cart to Orders for account 0\n");
		a1.AccShoppingCart(cart1);
		a1.newOrder();
		System.out.println(a1.toString());

		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 8:\n");
		System.out.println("Transfer from cart to Orders\n");
		Order or1= new Order();
		or1.cartToOrder(a1);
		System.out.println(or1.toString());
		
		System.out.println("\n"+"-------------------------------------------------------"+"\n");
		System.out.println("Case 9:\n");
		System.out.println("Check Payment\n");
		Payment pay1=new Payment(or1.getTotal(),"egsdfgasgs",a1);
		or1.addPayment(pay1);
		System.out.println(or1.getPayment());

	}
}
