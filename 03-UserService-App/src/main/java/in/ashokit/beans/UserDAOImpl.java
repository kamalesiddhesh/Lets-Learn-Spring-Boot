package in.ashokit.beans;

public class UserDAOImpl implements UserDAO{

	public String findName(int id) {
		if(id<=10) {
			System.out.println("Searching String..........");
			return "Neo";
		}
		else {
			return "";
		}
	}

}
