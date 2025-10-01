package e_commerce_cart_system;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// create user
		User user = new User(1, "Nirbhay", "golu@gmail.com");
		
		//Create product
		
		Product product1 = new Product(1, "USB Cable", "use for charging mobile, tablet, etc", 105, 100);
		Product product2 = new Product(2, "Charger", "for mobile", 400, 2);
		
		
		Cart cart = new Cart(1, user);
		List<CartItem> items = new ArrayList<>();
		items.add(new CartItem(1, product1, 99));
		items.add(new CartItem(2, product2,2));
		
		cart.items.addAll(items);
		
		
		Order order  = OrderService.createOrder(user, cart, PaymentMode.CREDIT_CARD);
		
		System.out.println("Dear "+order.user.userName+" your order was successfully placed. "+" Order Id: "+order.orderId+" List of Prodcut is:- "
				+ order.items.iterator().next().prodcut.productName+" Total Amount is - "+ order.totalAmount);
		//Create second user
		
		User user2 = new User(2, "Golu", "");
		
		Cart cart1 = new Cart(1, user2);
		List<CartItem> items1 = new ArrayList<>();
		items1.add(new CartItem(1, product1, 99));
		items1.add(new CartItem(2, product2,2));
		
		Order order2  = OrderService.createOrder(user2, cart1, PaymentMode.UPI);
		
		System.out.println("Dear "+order2.user.userName+" your order was successfully placed. "+" Order Id: "+order2.orderId+" List of Prodcut is:- "
				+ order2.items.iterator().next()+" Total Amount is - "+ order2.totalAmount);
		
		
		
	}
}
