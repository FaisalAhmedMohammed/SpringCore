package in.ahmed.beans;

public class SonyPrinter implements IPrinter {
	public SonyPrinter() {
		System.out.println("sonyprinter::constructor");
	}

	public void print() {
		System.out.println("Printing through sonyprinter");

	}

}
