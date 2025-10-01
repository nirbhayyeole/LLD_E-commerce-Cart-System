package e_commerce_cart_system;

import java.util.ArrayList;
import java.util.Random;

public class OrderService {
	
	public static Order createOrder(User user, Cart cart, PaymentMode paymentType) {
		double amount=0;
		for(CartItem ct : cart.items) {
			if(ct.prodcut.productQuantity<ct.quantity) {
				throw new RuntimeException("Product: "+ct.prodcut.productName +" is out of stock");
			}
			amount+=ct.prodcut.price*ct.quantity;
			ct.prodcut.productQuantity-=ct.quantity;
		}
		
		Order order = new Order();
		
		
		Payment pay = new PaymentService();
		 amount = pay.payment(paymentType, amount) ;
		
		order.orderId = new Random().nextInt(100000);
		order.user=user;
		order.items = new ArrayList<>(cart.items);
		order.totalAmount=amount;
		order.status= OrderStatus.CONFIRMED;
		
		return order;
		
	}

}
