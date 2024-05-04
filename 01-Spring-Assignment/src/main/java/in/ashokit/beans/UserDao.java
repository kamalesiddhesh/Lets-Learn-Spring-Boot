package in.ashokit.beans;

import java.sql.SQLException;

public interface UserDao {
	public boolean save(User user) throws SQLException;
}
