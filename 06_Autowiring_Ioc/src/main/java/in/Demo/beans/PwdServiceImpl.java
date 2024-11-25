package in.Demo.beans;

public class PwdServiceImpl implements IPwdService {
	public PwdServiceImpl() {
		System.out.println("PwdService :: constructor");
	}

	@Override
	public String generatePwd() {
		System.out.println("password generated");
		return "ashok@123";

	}

}
