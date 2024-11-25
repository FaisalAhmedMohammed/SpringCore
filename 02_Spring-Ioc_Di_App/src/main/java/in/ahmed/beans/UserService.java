package in.ahmed.beans;

public class UserService {
	
	private PwdService pwdservice;

	public UserService() {
		System.out.println("UserService  :: Constructor");
	}
	// setter method

	public void setPwdservice(PwdService pwdservice) {
		System.out.println("setter() method");
		this.pwdservice = pwdservice;
	}

	public void saveuser(String username, String pwd, Long phone) {
		// encoding password
		String encodePwd = pwdservice.encodePwd(pwd);

		System.out.println("encoded pas" + encodePwd);

		// TODO insert into db
		System.out.println("Records inserted in db");

	}

}
