package e_commerce_cart_system;

import java.util.List;

public class Order {

	int orderId;
	User user;
	List<CartItem> items;
	double totalAmount;
	OrderStatus status;
	
}
