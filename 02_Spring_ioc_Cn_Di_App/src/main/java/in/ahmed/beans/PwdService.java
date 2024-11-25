package in.ahmed.beans;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdService {

	public PwdService() {

		System.out.println("pwdservice::consrtuctor");
	}

	public String encodepwd(String pwd) {
		Encoder encoder = Base64.getEncoder();
		String encoderpwd = encoder.encodeToString(pwd.getBytes());
		return encoderpwd;
	}

}
