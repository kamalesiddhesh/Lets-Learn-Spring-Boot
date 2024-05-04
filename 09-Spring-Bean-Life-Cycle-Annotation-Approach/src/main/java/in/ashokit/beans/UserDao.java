package in.ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class UserDao{
	
	@PostConstruct
	public void init() {
		System.out.println("init method......");
	}
	
	public void getData() {
		System.out.println("Getting Data from DB......");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method......");
	}	
}
