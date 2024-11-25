package in.ahmed.beans;

public class Car {
	private Engine engine;

	public Car() {

		System.out.println("Car::constructor");
	}

	public void setEngine(Engine engine) {
		System.out.println("setter()method");
		this.engine = engine;
	}

	public Car(Engine engine) {
		System.out.println("param()constructor");
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journey started");

		} else {
			System.out.println("Engine failed");
		}

	}

}
