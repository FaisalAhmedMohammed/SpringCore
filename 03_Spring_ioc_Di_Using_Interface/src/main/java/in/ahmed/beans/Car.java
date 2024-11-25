package in.ahmed.beans;

public class Car {
	private IEngine eng;

	public Car() {
		System.out.println("car::constructor");
	}

	// setter injection
	public void setEng(IEngine eng) {
		System.out.println("petrol object");
		this.eng = eng;
	}

//	constructer injection
	Car(IEngine eng) {
		this.eng = eng;
	}

	public void start() {
		int drive = eng.drive();
		if (drive >= 1) {
			System.out.println("Journey started");
		} else {
			System.out.println("Engine failed");
		}

	}

}
