package in.ahmed.beans;

public class ATM {
	private IPrinter printer;

	public ATM() {
		System.out.println("ATM::constructor");
	}

	// setter injection
	public void setPrinter(IPrinter printer) {
		System.out.println("setter()method called");
		this.printer = printer;
	}

	// constructor injection
	public ATM(IPrinter printer) {
		System.out.println("param :: constructor");
		this.printer = printer;
	}

	public void withdraw() {
		printer.print();
		System.out.println("withdrawl successful");
	}

}
