package e_commerce_cart_system;

public class PaymentService implements Payment {

	@Override
	public double payment(PaymentMode paymentMode, double amount) {
			double totalAmount =0;
		switch(paymentMode) {
		case CREDIT_CARD :
			totalAmount+=amount;
			System.out.println("Payment mode is Credit Card and Amount is:- "+amount );
			break;
		case UPI:
			totalAmount+=amount;
			System.out.println("Payment mode is UPI and Amount is:- "+amount );
		default:
			break;
		}
		return totalAmount;
	}

	
}
