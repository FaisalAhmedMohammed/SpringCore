package in.ahmed.beans;

public class Restuarant {

	private IPayment ip;

	public Restuarant() {
		System.out.println("Restuarant::constructor");
	}

//constructor injection
	public Restuarant(IPayment ip) {
		super();
		this.ip = ip;
	}

	public void bill() {
		System.out.println("Processing the payment");
		ip.pay();
		System.out.println("Bill Generated");

	}

}
