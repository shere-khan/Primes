package justin.webapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import justin.common.HelloWorld;

public class WebApplication {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		
		HelloWorld helloWorldBean = (HelloWorld) context.getBean("helloWorldBean");
		helloWorldBean.printHelloWorld();
	}
}
