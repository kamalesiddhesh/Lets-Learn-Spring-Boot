package in.ashokit.beans;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.beans.*;

@Service
public class UserService {
	@Autowired
	private UserDao dao;
	int id = 30;
	String name="Darshan";
	String city ="Satara";
	
	User user = new User(id,name,city);
		
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	public void saveUser() throws SQLException{
		if(dao.save(user)== true) {
			System.out.println("User data inserted Succesfully....");
		}
		else {
			System.out.println("Data can't be inserted.....sorry");
		}
	}
}
