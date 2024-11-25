package in.ahmed.beans;

public class DebitCard implements IPayment {

	public DebitCard() {
		System.out.println("Debitcard::constructor");
	}

	@Override
	public void pay() {
		System.out.println("Amount paid through DebitCard");

	}

}
