package in.ahmed.beans;

public class CreditCard implements IPayment {

	public CreditCard() {
		System.out.println("creditcard::constructor");
	}

	@Override
	public void pay() {
		System.out.println("Amount paid through CreditCard");

	}

}
