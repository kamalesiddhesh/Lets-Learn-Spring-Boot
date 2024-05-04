package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.AppConfig;
import in.ashokit.beans.UserDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt =  new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao dao =  ctxt.getBean(UserDao.class);
		
		dao.getData();
		ConfigurableApplicationContext cctx = (ConfigurableApplicationContext)ctxt;
		cctx.close();
	}
}
