package in.ashokit.beans;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
       this.jdbcTemplate = jdbcTemplate;
    } 
    
	
	String sql = "INSERT INTO users (id, name, city) VALUES (?, ?, ?)";
	public boolean save(User user) throws SQLException{		
		
		int updateVal = jdbcTemplate.update(sql,user.getId(),user.getName(),user.getCity() );
		if(updateVal>0) {
			return true;
		}
		else
			return false;
	}
}
