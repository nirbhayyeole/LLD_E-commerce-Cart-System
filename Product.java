package e_commerce_cart_system;

public class Product {

	int productId;
	String productName;
	String productDescription;
	double price;
	int productQuantity;
	public Product(int productId, String productName, String productDescription, double price, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.productQuantity = productQuantity;
	}
	
	
	
}
