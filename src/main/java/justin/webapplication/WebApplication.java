package justin.webapplication;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.WebApplicationInitializer;

import justin.common.HelloWorld;

public class WebApplication implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");

		HelloWorld helloWorldBean = (HelloWorld) context.getBean("helloWorldBean");
	}
}
