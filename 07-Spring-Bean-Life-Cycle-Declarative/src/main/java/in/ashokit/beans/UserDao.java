package in.ashokit.beans;

public class UserDao {
	
	public void init() {
		System.out.println("Getting db Connection...");
	}
	
	public void getData() {
		System.out.println("Getting data from db...");
	}
	
	public void destroy() {
		System.out.println("Closing db Connection...");
	}
}
