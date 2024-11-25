package in.ahmed;

public class Test {
	public static void main(String[] args) {

		DateUtils du = DateUtils.getInstanse();

		System.out.println(du.hashCode());
		DateUtils d1 = DateUtils.getInstanse();
		System.out.println(d1.hashCode());

	}
}
