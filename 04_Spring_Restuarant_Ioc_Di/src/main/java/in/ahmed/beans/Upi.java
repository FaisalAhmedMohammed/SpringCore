package in.ahmed.beans;

public class Upi implements IPayment {

	public Upi() {
		System.out.println("upi::constructor");
	}

	@Override
	public void pay() {
		System.out.println("Amount paid through Upi");

	}

}
