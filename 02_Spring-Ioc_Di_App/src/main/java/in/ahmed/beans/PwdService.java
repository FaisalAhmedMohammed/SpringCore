package in.ahmed.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {

	public PwdService() {
		System.out.println("pwdservice :: Constructer");
	}

	public String encodePwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		String encodedpwd = encoder.encodeToString(pwd.getBytes());
		return encodedpwd;
	}

}
