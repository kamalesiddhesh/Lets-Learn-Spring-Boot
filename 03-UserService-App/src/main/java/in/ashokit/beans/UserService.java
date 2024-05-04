package in.ashokit.beans;

public class UserService {
	
	private UserDAO uDao;

	public UserDAO getuDao() {
		return uDao;
	}

	public void setuDao(UserDAO uDao) {
		this.uDao = uDao;
	}
	
	public void toCheckUserName(int id) {
		if(uDao.findName(id).equalsIgnoreCase("Neo")) {
			System.out.println("Hurrayy.... Found User Name");
		}
		else {
			System.out.println("Not Found... Please try again");
		}
	}
}