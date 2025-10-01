package e_commerce_cart_system;

public class CartItem {

	int cartItemId;
	Product prodcut;
	int quantity;
	public CartItem(int cartItemId, Product prodcut, int quantity) {
		super();
		this.cartItemId = cartItemId;
		this.prodcut = prodcut;
		this.quantity = quantity;
	}
	
	
	
}
