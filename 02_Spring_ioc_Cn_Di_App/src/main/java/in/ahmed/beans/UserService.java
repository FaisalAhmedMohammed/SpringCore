package in.ahmed.beans;

public class UserService {

	private PwdService pwdService;

	// Setter Injection
	public void setPwdService(PwdService pwdService) {
		this.pwdService = pwdService;
	}

	// constructor Injection
	public UserService(PwdService pwdService) {
		System.out.println("param ()constructou");
		this.pwdService = pwdService;
	}

	public UserService() {

		System.out.println("userservice::constructor");
	}

	public void saveUser(String name, String pwd, Long phone) {

		String encodepwd = pwdService.encodepwd(pwd);
		System.out.println("encoded password is :" + encodepwd);
		System.out.println("record inserted in databse");

	}

}
