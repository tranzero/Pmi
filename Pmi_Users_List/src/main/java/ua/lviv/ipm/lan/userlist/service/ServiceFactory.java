package ua.lviv.ipm.lan.userlist.service;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class ServiceFactory {
	private ServiceFactory() { }

	private final static ApplicationContext appContext = 
	    	  new ClassPathXmlApplicationContext("/WEB-INF/spring/root-context.xml");

	private static ApplicationContext getApplicationContext()
	{
		return appContext;
	}

	public static <S extends BaseService> S getService(Class<S> clazz) {
		return (S) getApplicationContext().getBean(clazz);
	}

}