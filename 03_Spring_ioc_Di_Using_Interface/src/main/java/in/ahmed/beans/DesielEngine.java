package in.ahmed.beans;

public class DesielEngine implements IEngine {

	public DesielEngine() {
		System.out.println("DesielEngine::constructor");
	}

	@Override
	public int drive() {
		System.out.println("Engine Started");
		return 1;
	}

}
