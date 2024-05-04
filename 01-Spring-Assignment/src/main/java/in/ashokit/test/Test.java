package in.ashokit.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.AppConfig;
import in.ashokit.beans.UserDaoImpl;
import in.ashokit.beans.UserService;


public class Test {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctxt =  new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = ctxt.getBean(UserService.class);
		userService.saveUser();
//		User user =  new User();
//		user.setId(10);
//		user.setName("Sid");
//		user.setCity("Mumbai");
	}

}
