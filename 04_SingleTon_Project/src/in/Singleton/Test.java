package in.Singleton;

public class Test extends SingleTonClasss {
	Test(int i) {
		super(i);
		
	}

	public static void main(String[] args) {
		SingleTonClasss s = new SingleTonClasss(10);
		System.out.println(s.hashCode());
		
		
		SingleTonClasss ss=new SingleTonClasss(20);
				System.out.println(ss.hashCode());

		/*
		 * SingleTonClasss single = SingleTonClasss.ToInstanse();
		 * 
		 * System.out.println(single.hashCode());
		 * 
		 * SingleTonClasss single2 = SingleTonClasss.ToInstanse();
		 * System.out.println(single2.hashCode());
		 */

	}

}
