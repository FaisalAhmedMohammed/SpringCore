package in.ahmed;

public class DateUtils {

	// static DateUtils du = new DateUtils();// early loading means creating the
	// objects at class level bocz when ever the
	// class is loaded then the object is created if we dont use that object
	// then the memory is wasted so we need to go for lazy loading

	private static DateUtils instanse = null;

	private DateUtils() {
		System.out.println("DateUtils::constructor");// constructor
	}

	public static DateUtils getInstanse() {
		if (instanse == null) {
			instanse = new DateUtils();
		}
		return instanse;

	}

}
