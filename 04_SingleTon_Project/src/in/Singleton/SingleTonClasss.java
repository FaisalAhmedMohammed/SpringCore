package in.Singleton;

 public class SingleTonClasss {

	private static SingleTonClasss instanse = null;

	private SingleTonClasss() {
		System.out.println("constructor");
	}

	SingleTonClasss(int i) {
		System.out.println("parameterized :: constructor");
		System.out.println(i);
	}

	public static SingleTonClasss ToInstanse() {

		if (instanse == null) {
			instanse = new SingleTonClasss();
		}
		return instanse;

	}

}
