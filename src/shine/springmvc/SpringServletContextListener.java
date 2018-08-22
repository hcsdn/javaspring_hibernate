package shine.springmvc;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringServletContextListener implements ServletContextListener  {
	
	public SpringServletContextListener() {
		
	}
	
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Listenered context started");
		ServletContext ctx = arg0.getServletContext();
		String config = ctx.getInitParameter("springConfig");
		System.out.println(config);
		ApplicationContext springCtx = new ClassPathXmlApplicationContext(config);
		ctx.setAttribute("SpringCtx", springCtx);
	}
}
