# Online-Shopping
Java program from the following UML class diagram.
#PART 1: Create a Java program from the following UML class 
diagram.
 Each customer has unique id and is linked to exactly one account. 
 Account owns shopping cart and orders. 
 Customer could register as a web user to be able to buy items online. 
 Customer is not required to be a web user because purchases could also be 
made by phone or by ordering from catalogs. 
 Web user has login name which also serves as unique id. 
 Web user could be in several states - new, active, temporary blocked, or banned,
and be linked to a shopping cart. 
 Shopping cart belongs to account. 
 Account owns customer orders. 
 Customer may have no orders. 
 Customer orders are sorted and unique. 
 Each order could refer to several payments, possibly none. 
 Every payment has unique id and is related to exactly one account.
 Each order has current order status. 
 Both order and shopping cart have line items linked to a specific product. 
 Each line item is related to exactly one product. 
 A product could be associated to many line items or no item at all
