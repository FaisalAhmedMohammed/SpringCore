package in.Demo.beans;

public class UserDaoImpl implements IUserDao {
	public UserDaoImpl() {
		System.out.println("UserDao::constructor");

	}

	@Override
	public void SaveUser() {
		System.out.println("Record Inserted in Database");

	}

}
