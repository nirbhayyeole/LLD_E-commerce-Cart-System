package e_commerce_cart_system;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	int cardId;
	User user;
	List<CartItem> items = new ArrayList<>();
	public Cart(int cardId, User user) {
		super();
		this.cardId = cardId;
		this.user = user;
	}
	
	
}
