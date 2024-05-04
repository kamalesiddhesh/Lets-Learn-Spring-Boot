package in.ashokit;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan
public class AppConfig {
	
	String cls = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/my";
    String username = "root";
    String password = "password";
	
	@Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
       return new JdbcTemplate(dataSource());
    }

}
