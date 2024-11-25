package in.Demo.beans;

public class EmailServiceImpl implements IEmalService {
	public EmailServiceImpl() {
		System.out.println("Email::constructor");
	}

	@Override
	public void sendEmail() {
		System.out.println("password send through email");

	}

}
