package in.Demo.beans;

public class UserService {
	private IPwdService ipwdservice;
	private IUserDao iuserdao;
	private IEmalService iemailServie;

	public UserService() {
		System.out.println("user::constructor");
	}

	public void userRegistation() {
		ipwdservice.generatePwd();
		iuserdao.SaveUser();
		iemailServie.sendEmail();
		System.out.println("user registration successful");
	}

	public UserService(IPwdService ipwdservice, IUserDao iuserdao, IEmalService iemailServie) {
		super();
		this.ipwdservice = ipwdservice;
		this.iuserdao = iuserdao;
		this.iemailServie = iemailServie;
		System.out.println("param");
	}

}
