package in.ahmed.beans;

public class PetrolEngine implements IEngine {
	public PetrolEngine() {

		System.out.println("PetrolEngine::constructor");
	}

	@Override
	public int drive() {
		System.out.println("PetrolEngine Started");
		return 1;
	}

}
