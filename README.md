# Online-Shopping
Java program from the following UML class diagram.
#PART 1: Create a Java program from the following UML class 
diagram.
 Each customer has unique id and is linked to exactly one account. <br/>
 Account owns shopping cart and orders. <br/>
 Customer could register as a web user to be able to buy items online. <br/>
 Customer is not required to be a web user because purchases could also be 
made by phone or by ordering from catalogs. <br/>
 Web user has login name which also serves as unique id. <br/>
 Web user could be in several states - new, active, temporary blocked, or banned,
and be linked to a shopping cart. <br/>
 Shopping cart belongs to account. <br/>
 Account owns customer orders. <br/>
 Customer may have no orders. <br/>
 Customer orders are sorted and unique. <br/>
 Each order could refer to several payments, possibly none. <br/>
 Every payment has unique id and is related to exactly one account.<br/>
 Each order has current order status. <br/>
 Both order and shopping cart have line items linked to a specific product. <br/>
 Each line item is related to exactly one product. <br/>
 A product could be associated to many line items or no item at all. <br/>
